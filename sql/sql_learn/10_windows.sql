CREATE Table sales (
    id INT PRIMARY KEY AUTO_INCREMENT,
    city VARCHAR(15),
    county VARCHAR(15),
    sales_value DECIMAL
);

INSERT INTO
    sales (city, county, sales_value)
VALUES ('北京', '海淀', 10.00),
    ('北京', '朝阳', 20.00),
    ('上海', '黄埔', 30.00),
    ('上海', '长宁', 10.00);

SELECT * FROM sales;

-- 现在计算这个网站在每个城市的销售总额，在全国的销售总额
-- 每个区的销售额占所在城市销售额中的比率，一集占总销售额中的比率
-- 不用窗口函数：建临时表存全国总额
CREATE TEMPORARY TABLE a AS
SELECT SUM(sales_value) AS sales_value
FROM sales;
-- temporary 临时 全国总销售额

SELECT * FROM a;

-- 不用窗口函数：建临时表存各城市总额
CREATE TEMPORARY TABLE b AS
SELECT city, SUM(sales_value) AS sales_value
FROM sales
GROUP BY
    city;

SELECT * FROM b;

-- 不用窗口函数：手动JOIN临时表算比率
SELECT
    s.city AS 城市,
    s.county AS 区,
    s.sales_value AS 销售额,
    b.sales_value AS 城市销售额,
    s.sales_value / b.sales_value AS 区占城市销售额比率,
    s.sales_value / a.sales_value AS 区占总销售额比率
FROM sales s
    JOIN b ON (s.city = b.city)
    JOIN a
ORDER BY s.city, s.county;

-- 使用窗口函数：不需要建临时表，OVER里面直接算
SELECT
    city AS 城市,
    county AS 区,
    sales_value AS 区销售额,
    SUM(sales_value) OVER (
        PARTITION BY
            city
    ) AS 城市销售额,
    sales_value / SUM(sales_value) OVER (
        PARTITION BY
            city
    ) AS 区占城市销售额比率,
    sales_value / SUM(sales_value) OVER () AS 区占总销售额比率
FROM sales
ORDER BY city, county;

-- 准备工作：建goods商品表
CREATE TABLE goods (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category_id INT,
    category VARCHAR(15),
    name VARCHAR(30),
    price DECIMAL(10, 2),
    stock INT,
    upload_time DATETIME
);

INSERT INTO
    goods (
        category_id,
        category,
        name,
        price,
        stock,
        upload_time
    )
VALUES (
        1,
        '手机',
        'iPhone 11 Pro',
        9999,
        100,
        '2020-01-01 00:00:00'
    ),
    (
        1,
        '手机',
        'iPhone 11',
        7999,
        200,
        '2020-01-01 00:00:00'
    ),
    (
        1,
        '手机',
        'iPhone X',
        6999,
        300,
        '2020-01-01 00:00:00'
    ),
    (
        1,
        '手机',
        '华为Mate30 Pro',
        6999,
        200,
        '2020-01-01 00:00:00'
    ),
    (
        2,
        '女装精品',
        '连衣裙',
        299,
        100,
        '2020-01-01 00:00:00'
    ),
    (
        2,
        '女装精品',
        '半身裙',
        199,
        200,
        '2020-01-01 00:00:00'
    );

SELECT * FROM goods;

-- 序号函数
-- ROW_NUMBER：给每组内每一行一个唯一序号，不会重复
-- 按category分组，price降序，每个分类下价格最高的商品排第1
SELECT
    id,
    ROW_NUMBER() OVER (
        PARTITION BY
            category
        ORDER BY price DESC
    ) AS row_num,
    category_id,
    category,
    name,
    price,
    stock
FROM goods;

-- RANK：排名，并列时会跳号（1，1，3）
-- 按category_id分组，price降序排
SELECT
    id,
    RANK() OVER (
        PARTITION BY
            category_id
        ORDER BY price DESC
    ) AS row_num,
    category_id,
    category,
    name,
    price,
    stock
FROM goods;

-- DENSE_RANK：排名，并列时不跳号（1，1，2）
-- 按category_id分组，price降序排
SELECT
    id,
    DENSE_RANK() OVER (
        PARTITION BY
            category_id
        ORDER BY price DESC
    ) AS row_num,
    category_id,
    category,
    name,
    price,
    stock
FROM goods;

-- 分布函数
-- PERCENT_RANK：百分比排名，(rank-1)/(总行数-1)，值范围0~1
-- 0表示最高，1表示最低
SELECT RANK() OVER w AS r, PERCENT_RANK() OVER w AS pr
FROM goods
WHERE
    category_id = 1
WINDOW w AS (
        PARTITION BY
            category_id
        ORDER BY price DESC
    );

-- CUME_DIST：累计分布值，<=当前值的行数/总行数
SELECT CUME_DIST() OVER w AS cd
FROM goods
WHERE
    category_id = 1
WINDOW w AS (
        PARTITION BY
            category_id
        ORDER BY price DESC
    );

-- 前后函数
-- LAG：取前一行的值，LAG(price, 1)表示取同一分组内前一个price
-- 子查询先算出差价后，外层再计算当前价格与前一个价格的差值
SELECT
    id,
    category,
    name,
    price,
    price - pre_price AS diff_price
FROM (
        SELECT
            id, category, name, price, LAG(price, 1) OVER w AS pre_price
        FROM goods
        WINDOW w AS (
                PARTITION BY
                    category_id
                ORDER BY price
            )
    ) AS t;

-- LEAD：取后一行的值，LEAD(price, 1)表示取同一分组内后一个price
SELECT
    id,
    category,
    name,
    price,
    price - lead_price AS diff_price
FROM (
        SELECT
            id, category, name, price, LEAD(price, 1) OVER w AS lead_price
        FROM goods
        WINDOW w AS (
                PARTITION BY
                    category_id
                ORDER BY price
            )
    ) AS t

-- 首尾函数
-- FIRST_VALUE：取分组内第一行的值，这里是每个分类中价格最低的商品
SELECT
    id,
    category,
    name,
    price,
    FIRST_VALUE(price) OVER w AS first_price
FROM goods
WINDOW w AS (
        PARTITION BY
            category
        ORDER BY price
    );

-- LAST_VALUE：取分组内最后一行的值，这里是每个分类中价格最高的商品
-- 注意：默认窗口范围是当前行到末尾，结果可能会变，需加ROWS BETWEEN
SELECT
    id,
    category,
    name,
    price,
    LAST_VALUE(price) OVER w AS last_price
FROM goods
WINDOW w AS (
        PARTITION BY
            category
        ORDER BY price
    );

-- 其他函数
-- NTH_VALUE：取分组内第N行的值，NTH_VALUE(price, 2)取每个分类中价格第2低的商品
SELECT
    id,
    category,
    name,
    price,
    NTH_VALUE(price, 2) OVER w AS nth_price
FROM goods
WINDOW w AS (
        PARTITION BY
            category
        ORDER BY price
    );

-- NTILE：将分组内的数据分成N组，NTILE(3)将数据分成3组
SELECT
    id,
    category,
    name,
    price,
    NTILE(3) OVER w AS ntile
FROM goods
WINDOW w AS (
        PARTITION BY
            category
        ORDER BY price
    );