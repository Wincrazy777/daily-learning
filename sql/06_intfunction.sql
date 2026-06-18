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

