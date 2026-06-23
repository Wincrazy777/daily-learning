-- 多表查询练习
-- 使用 data/dept_emp.sql 中的 dept 和 emp 表
USE sql_learn;

--多表查询 笛卡尔积 隐式内连接
SELECT * FROM emp , dept;

SELECT * FROM emp , dept WHERE emp.dept_id = dept.id;

--显式内连接
--查询每一个员工的姓名，及关联的部门的名称
SELECT emp.name ,dept.name FROM emp , dept WHERE emp.dept_id = dept.id;
SELECT emp.name dept.name FROM emp  INNER JOIN dept ON emp.dept_id = dept.id;

--外连接
--左外连接 查询所有员工，包括没有部门的
SELECT emp.* ,dept.name FROM emp LEFT JOIN dept ON emp.dept_id = dept.id;
-- 右外连接 查询所有部门，包括没有员工的
SELECT emp.* ,dept.name FROM emp RIGHT JOIN dept ON emp.dept_id = dept.id;

--自连接
--查询员工及其所属领导的名字
SELECT a.name , b.name FROM emp a , emp b WHERE a.managerid = b.id;
--查询所有员工及其所属领导的名字，包括没有领导的员工
SELECT a.name '员工' , b.name '领导' FROM emp a LEFT JOIN emp.b ON a.manager = b.id;

--联合查询
SELECT * FROM emp WHERE salary <5000 UNION SELECT * FROM emp WHERE age >50;

--子查询(嵌套查询)
--标量子查询
--查询销售部的所有员工信息
SELECT * FROM emp WHERE dept_id = (SELECT id FROM dept WHERE name = '销售部');
--查询在'方东白'入职之后的员工信息
SELECT * FROM emp WHERE entrydate > (SELECT * FROM emp WHERE name = '方东白');

--列子查询
--查询销售部和市场部所有的员工信息
SELECT * FROM emp WHERE dept_id IN (SELECT id FROM dept WHERE name = '销售部' or name = '市场部');
--查询比财务部所有人工资都高的员工信息
SELECT * FROM emp WHERE > ALL (SELECT salary FROM emp where dept_id = (SELECT id FROM emp WHERE name='财务');)
--查询比研发部其中一人工资高的员工信息
SELECT * FROM emp WHERE > ANY (SELECT salary FROM emp where dept_id = (SELECT id FROM emp WHERE name='研发');)

--行子查询
--查询与郭嘉的薪资及直属领导相同的员工信息
SELECT * FROM emp WHERE (salary,managerid) = (SELECT salary , managerid FROM emp WHERE name = '张无忌');

--表子查询
--查询与鹿杖客 宋远桥的职位和薪资相同的员工
SELECT * FROM emp WHERE (job,salary) in (SELECT job , salary FROM emp WHERE name = '鹿杖客' or name = '宋远桥');
--查询入职日期在2006-01-01之后的员工的信息及其部门信息
SELECT emp.*,dept.* FROM (SELECT * FROM EMP WHERE entrydate > '2006-1-01') emp LEFT JOIN dept ON emp.dept_id = dept.id;
