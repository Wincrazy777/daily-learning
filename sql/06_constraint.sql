USE sql_learn;
-- 约束命令
CREATE TABLE user (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
    -- PRIMARY KEY：主键 唯一  AUTO_INCREMENT：自增
    name VARCHAR(10) NOT NULL UNIQUE COMMENT '姓名',
    -- 非空：notnull 唯一：unique
    age INT CHECK(age > 0 AND age < 65) COMMENT '年龄',
    -- check：约束满足条件
    status CHAR(1) DEFAULT '1' COMMENT '状态',
    -- 不填则默认为1
    gender CHAR(1) COMMENT '性别'
) COMMENT '用户名';

-- 插入数据
INSERT INTO user(name,age,status,gender) VALUES ('root',12,'1','男');
INSERT INTO user(name,age,status,gender) VALUES ('admin',25,'1','男');
INSERT INTO user(name,age,status,gender) VALUES ('admin1',25,'1','男');
SELECT * FROM user;

--外键关联
ALTER Table emp1 ADD CONSTRAINT fk_emp_dept FOREIGN KEY(dept_id) REFERENCES dept(id);