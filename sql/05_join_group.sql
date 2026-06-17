USE sql_learn;

CREATE TABLE department (id INT, name VARCHAR(20));

INSERT INTO department VALUES (1, '技术部');

INSERT INTO department VALUES (2, '市场部');

INSERT INTO department VALUES (3, '财务部');

CREATE TABLE employee (
    id INT,
    name VARCHAR(20),
    dept_id INT,
    salary INT
);

INSERT INTO employee VALUES (1, '赵六', 1, 8000);

INSERT INTO employee VALUES (2, '钱七', 1, 9000);

INSERT INTO employee VALUES (3, '孙八', 2, 7000);

INSERT INTO employee VALUES (4, '周九', 2, 7500);

INSERT INTO employee VALUES (5, '吴十', 3, 8500);

SELECT * FROM department;

SELECT * FROM employee;

-- 查每个员工的名字+部门名
SELECT employee.name, department.name
FROM employee
    JOIN department ON employee.dept_id = department.id;

-- 查每个部门的人数(GROUP BY)
SELECT department.name, COUNT(*)
FROM employee
    JOIN department ON employee.dept_id = department.id
GROUP BY
    department.name

-- 3. 查每个部门的平均工资
SELECT department.name, AVG(employee.salary)
FROM employee
    JOIN department ON employee.dept_id = department.id
GROUP BY
    department.name;

-- 4. 查工资最高的员工
SELECT name, salary FROM employee ORDER BY salary DESC LIMIT 1;