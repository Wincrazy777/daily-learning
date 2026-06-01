package com.面向对象高级.多态.ooptest1;

public class Test {
    public static void main(String[] args) {
        //创建一个学生的对象
        Student stu = new Student("张三", "zhangsan", "123456");
        // 创建学生管理系统的对象
        StudentManager sm = new StudentManager();
        //调用注册的方法
        sm.register(stu);


        Teacher t = new Teacher("李四", "lisi", "654321");
        sm.register(t);

        Admin a = new Admin("王五", "wangwu", "987654");
        sm.register(a);
    }

}
