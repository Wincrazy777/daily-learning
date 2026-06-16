USE sql_learn;

CREATE TABLE emp(
    id INT COMMENT '编号',
    worknumber VARCHAR(10) COMMENT '员工工号',
    name VARCHAR(10) COMMENT '员工姓名',
    gender CHAR(1) COMMENT '性别',
    age TINYINT UNSIGNED COMMENT '年龄',
    idcard CHAR(18) COMMENT '身份证号',
    entrydate DATE COMMENT '入职时间' 
);

--添加字段
ALTER TABLE emp ADD nickname VARCHAR(20) COMMENT '昵称';

--修改数据类型
ALTER TABLE emp MODIFY nickname VARCHAR(30) COMMENT '昵称';

--修改字段名和字段类型
ALTER TABLE emp CHANGE nickname username VARCHAR(20) COMMENT '昵称';

--删除字段
ALTER TABLE emp DROP username;

--修改表名
ALTER TABLE emp RENAME TO employeee;

--删除表
DROP TABLE IF EXISTS employeee;

--删除指定表,并重新创建该表
TRUNCATE TABLE employeee;
