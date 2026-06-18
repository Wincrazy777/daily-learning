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
