CREATE DATABASE IF NOT EXISTS sql_learn DEFAULT CHARACTER SET = 'utf8mb4';

SHOW DATABASES;

DROP DATABASE IF EXISTS student;

USE sql_learn;

--查看当前数据库
SELECT DATABASE();

--创建表
CREATE TABLE student (
    id INT COMMENT '编号',
    name VARCHAR(20) COMMENT '姓名',
    age INT COMMENT '年龄',
    COMMENT '用户表'
);

INSERT INTO student VALUES (1, '张三', 18);

INSERT INTO student VALUES (2, '李四', 19);

--查询当前数据库所有表
SHOW TABLES;

--查询表结构
DESC student;

--查询指定表的建表语句
SHOW CREATE TABLE student;

--删除表
DROP TABLE student;

SELECT * FROM student;