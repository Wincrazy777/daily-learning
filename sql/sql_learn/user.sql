--查询用户
USE mysql;
SELECT * FROM user;

--创建用户wincrzy777
CREATE USER 'wincrazy777'@'localhost' IDENTIFIED BY '000000';

--创建用户wincrazy777任何主机都可以访问
CREATE USER 'wincrazy777'@'%' IDENTIFIED BY '000000';
--修改密码
ALTER USER 'wincrazy777'@'localhost' IDENTIFIED WITH mysql_native_password BY '000000';

--删除用户
DROP USER 'wincrazy777'@'localhost';

--查询权限
SHOW GRANTS FOR 'wincrazy777'@'localhost';

--授予权限
GRANT ALL ON sql_learn.* TO 'wincrazy777'@'localhost';

--撤销权限
REVOKE ALL ON sql_learn.* FROM 'wincrazy777'@'localhost';
