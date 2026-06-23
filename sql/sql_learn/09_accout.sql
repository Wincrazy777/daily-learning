-- 查看设置事务方式
SELECT @@autocommit; --为1自动提交

SELECT * FROM account WHERE name = '张三';

SET @@autocommit =0; --手动提交

UPDATE account SET money = money - 1000 WHERE name = '张三';
UPDATE account SET money = money + 10000 WHERE name = '李四';

--提交事务
COMMIT;

--回滚事务
ROLLBACK;


--开启事务
START TRANSACTION;

UPDATE account SET money = money - 1000 WHERE name = '张三';
UPDATE account SET money = money + 10000 WHERE name = '李四';

--提交事务
COMMIT;

--回滚事务
ROLLBACK;

--查看事务隔离级别
SELECT @@TRANSACTION_ISOLATION

--设置事务隔离级别
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;--可能会受到脏读，不可重复读，幻读的影响
SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED; --不会受到脏读的影响，但可能会受到不可重复读，幻读的影响
SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ;--默认，可能受到幻读的影响
SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;--不会受到任何影响