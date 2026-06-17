USE sql_learn;
CREATE TABLE emp(
    id INT COMMENT '编号',
    worknumber VARCHAR(10) COMMENT '员工工号',
    name VARCHAR(10) COMMENT '员工姓名',
    gender CHAR(1) COMMENT '性别',
    age TINYINT UNSIGNED COMMENT '年龄',
    idcard CHAR(18) COMMENT '身份证号',
    workaddress VARCHAR(50) COMMENT '工作地址',
    entrydate DATE COMMENT '入职时间'
) COMMENT '员工表';

INSERT INTO emp (id,worknumber,name,gender,age,idcard,workaddress,entrydate)
VALUES
(1, 'EMP001', '张三',   '男', 28, '110101199801011234', '北京', '2020-03-15'),
(2, 'EMP002', '李四',   '男', 32, '110101199201012345', '上海', '2019-07-01'),
(3, 'EMP003', '王五',   '女', 26, '110101199801014567', '广州', '2021-06-10'),
(4, 'EMP004', '赵六',   '女', 29, '110101199501017890', '深圳', '2020-09-22'),
(5, 'EMP005', '钱七',   '男', 35, '110101198901012345', '北京', '2018-04-18'),
(6, 'EMP006', '孙八',   '男', 24, '110101200001015678', '上海', '2022-01-04'),
(7, 'EMP007', '周九',   '女', 27, '110101199701019012', '广州', '2021-08-15'),
(8, 'EMP008', '吴十',   '男', 31, '110101199301013456', '深圳', '2019-11-30'),
(9, 'EMP009', '郑一',   '女', 23, '110101200101017890', '北京', '2022-07-20'),
(10, 'EMP010', '冯二',  '男', 30, '110101199401014567', '上海', '2020-05-12'),
(11, 'EMP011', '陈三',  '女', 33, '110101199101018901', '广州', '2018-09-05'),
(12, 'EMP012', '褚四',  '男', 25, '110101199901012345', '深圳', '2021-12-01'),
(13, 'EMP013', '卫五',  '男', 36, '110101198801016789', '北京', '2017-03-25'),
(14, 'EMP014', '蒋六',  '女', 28, '110101199801012346', '上海', '2020-10-10'),
(15, 'EMP015', '沈七',  '男', 22, '110101200201014567', '广州', '2023-04-17'),
(16, 'EMP016', '韩八',  '女', 34, NULL, '深圳', '2019-02-28');


-- 查询指定字段
SELECT name,worknumber,age FROM emp;

--查询所有字段返回
SELECT * FROM emp;

--查询所有的工作地址，起别名
SELECT workaddress AS '工作地址' FROM emp;

--查询员工的工作地址，不要重复
SELECT DISTINCT workaddress '工作地址' FROM emp;

--条件查询
SELECT * FROM emp WHERE age = 28;
SELECT * FROM emp WHERE age<25;
SELECT * FROM emp WHERE idcard IS NULL;
SELECT * FROM emp WHERE idcard IS NOT NULL;
SELECT * FROM emp WHERE age != 28;
SELECT * FROM emp WHERE age <> 28;
SELECT * FROM emp WHERE age >=15 AND age<=30;
SELECT * FROM emp WHERE gender = '女' AND age<=30;
SELECT * FROM emp WHERE age IN(28,32,22);
SELECT * FROM emp WHERE name LIKE '___';
SELECT * FROM emp WHERE idcard LIKE '%X';

-- 聚合函数
--SELECT COUNT(*) FROM emp;
SELECT COUNT(id) FROM emp;
SELECT AVG(age) FROM emp;
SELECT SUM(age) FROM emp WHERE workaddress = '北京';
SELECT MAX(age) FROM emp;
SELECT MIN(age) FROM emp;

-- 分组查询
SELECT workaddress, COUNT(*) FROM emp GROUP BY workaddress;
SELECT workaddress, AVG(age) FROM emp GROUP BY workaddress;
SELECT workaddress, COUNT(*) FROM emp GROUP BY workaddress HAVING COUNT(*) > 2;

-- 排序查询
SELECT * FROM emp ORDER BY age ASC;
SELECT * FROM emp ORDER BY age DESC;
SELECT * FROM emp ORDER BY entrydate DESC;
SELECT * FROM emp ORDER BY age ASC, entrydate DESC;

-- 分页查询
SELECT * FROM emp LIMIT 0, 5;
SELECT * FROM emp LIMIT 5, 5;
SELECT * FROM emp LIMIT 10, 5;
