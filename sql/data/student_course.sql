USE sql_learn;

DROP TABLE IF EXISTS student_core;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS course;

CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) COMMENT '学生姓名',
    number VARCHAR(20) COMMENT '学号'
) COMMENT '学生表';

CREATE TABLE course (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) COMMENT '课程名称'
) COMMENT '课程表';

CREATE TABLE student_core (
    studentid INT COMMENT '学生ID',
    courseid INT COMMENT '课程ID'
) COMMENT '选课表';

INSERT INTO student (id, name, number) VALUES
(1, '张三', '2024001'),
(2, '李四', '2024002'),
(3, '王五', '2024003'),
(4, '赵六', '2024004');

INSERT INTO course (id, name) VALUES
(1, 'Java程序设计'),
(2, '数据库原理'),
(3, '数据结构'),
(4, '操作系统');

INSERT INTO student_core (studentid, courseid) VALUES
(1, 1), (1, 2),
(2, 1), (2, 3),
(3, 2), (3, 4),
(4, 3), (4, 4);
