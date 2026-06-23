USE sql_learn;

-- 先删掉旧表重新创建
DROP TABLE IF EXISTS emp;
DROP TABLE IF EXISTS dept;

create table dept(
    id   int auto_increment comment 'ID' primary key,
    name varchar(50) not null comment '部门名称'
)comment '部门表';
INSERT INTO dept (id, name) VALUES (1, '研发部'), (2, '市场部'),(3, '财务部'), (4, '销售部');

create table emp(
    id  int auto_increment comment 'ID' primary key,
    name varchar(50) not null comment '姓名',
    age  int comment '年龄',
    job varchar(20) comment '职位',
    dept_id int comment '部门ID',
    managerid int comment '领导ID',
    salary int comment '工资'
)comment '员工表';
INSERT INTO emp (id, name, age, job, dept_id, managerid, salary) VALUES
(1, '张无忌', 20, '开发工程师', 1, null, 8000),
(2, '杨逍', 33, '架构师', 1, 1, 9000),
(3, '赵敏', 18, '市场专员', 2, 2, 7000),
(4, '常遇春', 43, '市场经理', 2, 2, 7500),
(5, '小昭', 19, '会计', 3, 1, 8500),
(6, '韦一笑', 48, '财务总监', 3, null, 9500),
(7, '张三丰', 60, '顾问', 4, null, 12000);
