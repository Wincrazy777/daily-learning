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