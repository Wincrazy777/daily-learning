USE sql_learn;

-- 1. 查询员工的姓名，年龄，职位，部门信息
SELECT emp.name, emp.age, emp.job, dept.name
FROM emp, dept
WHERE
    emp.dept_id = dept.id;

-- 2. 查询年龄小于30岁的员工的姓名，年龄，职位，部门信息
SELECT emp.name, emp.age, emp.job, dept.name
FROM emp
    INNER JOIN dept ON emp.dept_id = dept.id
WHERE
    emp.age < 30;

-- 3. 查询所有员工的部门ID，部门名称
SELECT DISTINCT dept.id, dept.name FROM dept;

-- 4. 查询所有年龄大于40岁的员工及部门名称，没有部门的也要展示
SELECT emp.*, dept.name
FROM emp
    LEFT JOIN dept ON emp.dept_id = dept.id
WHERE
    emp.age > 40;

-- 5. 查询所有员工的工资等级
SELECT emp.*, salgrade.grade
FROM emp, salgrade
WHERE
    emp.salary BETWEEN salgrade.losal AND salgrade.hisal;

-- 6. 查询研发部所有员工的信息及工资等级
SELECT emp.*, salgrade.grade
FROM emp, dept, salgrade
WHERE
    emp.dept_id = dept.id
    AND dept.name = '研发部'
    AND emp.salary BETWEEN salgrade.losal AND salgrade.hisal;

-- 7. 查询研发部员工的平均工资
SELECT AVG(emp.salary)
FROM emp, dept
WHERE
    emp.dept_id = dept.id
    AND dept.name = '研发部';

-- 8. 查询工资比张三丰高的员工信息
SELECT *
FROM emp
WHERE
    salary > (
        SELECT salary
        FROM emp
        WHERE
            name = '张三丰'
    );

-- 9. 查询比平均薪资高的员工信息
SELECT * FROM emp WHERE salary > ( SELECT AVG(salary) FROM emp );

-- 10. 查询低于本部门平均工资的员工信息
SELECT e2.*
FROM emp e2
WHERE
    e2.salary < (
        SELECT AVG(e1.salary)
        FROM emp e1
        WHERE
            e1.dept_id = e2.dept_id
    );

-- 11. 查询所有部门信息，并统计部门的员工人数
SELECT dept.id, dept.name, (
        SELECT COUNT(*)
        FROM emp
        WHERE
            emp.dept_id = dept.id
    ) AS '人数'
FROM dept;

-- 12. 查询所有学生的选课情况，展示学生名称，学号，课程名称
SELECT s.name, s.number, c.name
FROM
    student s,
    student_core sc,
    course c
WHERE
    s.id = sc.studentid
    AND sc.courseid = c.id;