-- concat 连接
SELECT CONCAT('hello','mysql');

--lower 转小写
SELECT LOWER('HELLO');

--upper 转大写
SELECT UPPER('hello');

--lpad 左填充
SELECT LPAD('hello',5,'-');

--rpad 右填充
SELECT RPAD('hello',5,'-');

--trim 去除空格
SELECT TRIM('  hello world   ')

--SUBSTRING 截取子串
SELECT SUBSTRING('hello world',1,5);

--企业员工的工号，统一为五位数，目前不足5位数的全部在前面补0
USE sql_learn;
UPDATE emp SET worknumber=LPAD(worknumber,5,0);

SELECT * FROM emp

--数值函数
--ceil 向上取整
SELECT CEIL(1.1);

--floor
SELECT FLOOR(1.9);

--mod 取余
SELECT MOD(3,10);

--rand 随机数
SELECT RAND();

--round 四舍五入
SELECT ROUND(2.344, 2);

--根据数据库的函数,生成一个六位数的验证码
SELECT LPAD(ROUND(RAND()*1000000,0),6,'0');

-- 日期函数
--curdate 当前日期
SELECT CURRENT_DATE();

--curtime 当前时期
SELECT CURRENT_TIME();

--now 当前时间
SELECT NOW();

--year month day
SELECT YEAR(NOW());
SELECT MONTH(NOW());
SELECT DAY(NOW());

--date_add 增加时间
SELECT DATE_ADD(NOW(),INTERVAL 1 MONTH);

--datediff
SELECT DATEDIFF('2019-10-01','2019-09-01');

--查询所有员工的入职天数,并根据入职天数倒序排序
USE sql_learn;
SELECT NAME,DATEDIFF(CURDATE(),entrydate) AS '入职天数' FROM emp ORDER BY '入职天数' desc;

--流程控制函数
--if
SELECT IF(1 > 0, '大于', '小于');
--如果第一个满足，那就输出第一个的值，不满足就返回第二个
--ifnull
SELECT IFNULL('1', '2');
--如果第一个不为空，那就返回第一个的值，为空就返回第二个的值
--case when then else and
USE sql_learn;

SELECT
    name,
    workaddress,
    CASE workaddress
        WHEN '北京' THEN '一线城市'
        WHEN '上海' THEN '一线城市'
        ELSE '二线城市'
    END
FROM emp;

--统计各个学员的成绩，展示的规则如下：
-- >=85 展示优秀
-- >=60 展示及格
-- 否则 展示不及格
CREATE TABLE score(
    id int COMMENT 'ID',
    name varchar(20) COMMENT '姓名',
    math int COMMENT '数学',
    english int COMMENT '英语',
    chinese int COMMENT '语文'
) COMMENT '学员成绩表';
INSERT INTO score (id, name, math, english, chinese) VALUES
(1, '张三', 85, 90, 88),
(2, '李四', 72, 65, 78),
(3, '王五', 95, 88, 92),
(4, '赵六', 58, 62, 55),
(5, '钱七', 88, 92, 85),
(6, '孙八', 63, 70, 66),
(7, '周九', 45, 50, 48),
(8, '吴十', 78, 82, 80),
(9, '郑一', 90, 85, 95),
(10, '冯二', 60, 55, 62);

SELECT * FROM score;

SELECT id, name, (
        CASE
            WHEN english >= 85 THEN '优秀'
            WHEN english >= 60 THEN '及格'
            ELSE '不及格'
        END
    ) AS '英语', (
        CASE
            WHEN math >= 85 THEN '优秀'
            WHEN math >= 60 THEN '及格'
            ELSE '不及格'
        END
    ) AS '数学', (
        CASE
            WHEN chinese >= 85 THEN '优秀'
            WHEN chinese >= 60 THEN '及格'
            ELSE '不及格'
        END
    ) AS '语文'
FROM score;
