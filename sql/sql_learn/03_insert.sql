USE sql_learn;

--添加数据
INSERT INTO
    employeee (
        id,
        worknumber,
        name,
        gender,
        age,
        idcard,
        entrydate
    )
VALUES (
        1,
        '1',
        '张三',
        '男',
        18,
        '111111111111111111',
        '2020-01-01'
    );

INSERT INTO
    employeee (
        id,
        worknumber,
        name,
        gender,
        age,
        idcard,
        entrydate
    )
VALUES (
        2,
        '2',
        '李四',
        '男',
        18,
        '222222222222222222',
        '2020-01-01'
    );

--插入多条数据
INSERT INTO
    employeee (
        id,
        worknumber,
        name,
        gender,
        age,
        idcard,
        entrydate
    )
VALUES (
        3,
        '3',
        '李四',
        '男',
        18,
        '222222222222222222',
        '2020-01-01'
    ),
    (
        4,
        '4',
        '李四',
        '男',
        18,
        '222222222222222222',
        '2020-01-01'
    );

--查询
SELECT * FROM employeee;

--修改数据
UPDATE employeee SET name = '张三丰' WHERE id = 1;
--修改多个数据
UPDATE employeee SET name = '小赵', gender = '女' WHERE id = 1;
--不带where全部都改
UPDATE employeee set entrydate = '2008-01-01'

--删除指定数据 不加where就是删除表的所有数据
DELETE FROM employeee WHERE id = 3;