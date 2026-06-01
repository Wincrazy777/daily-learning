package com.面向对象高级.继承.oopextendtest5;

public class Test {
    public static void main(String[] args) {
        Student s  = new Student("张三", 20, "大一");
        System.out.println("学生姓名：" + s.name);
        System.out.println("学生年龄：" + s.age);
        System.out.println("学生年级：" + s.grade);
        System.out.println("===============");
        Teacher t = new Teacher("李四", 30, "语文");
        System.out.println("教师姓名：" + t.name);
        System.out.println("教师年龄：" + t.age);
        System.out.println("教师学科：" + t.subject);
        System.out.println("===============");
        Student s1 = new Student();
        Teacher t1 = new Teacher();
        System.out.println(s1.name+"---"+s1.age+"---"+s1.grade);
        System.out.println(t1.name+"---"+t1.age+"---"+t1.subject);
    }

}
