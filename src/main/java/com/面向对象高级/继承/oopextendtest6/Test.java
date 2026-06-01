package com.面向对象高级.继承.oopextendtest6;

public class Test {

    //如果子类中有多个构造方法的时候，不能使用this（）互动调用，要留一个调用父类的构造方法
    //如果构造方法中写上了this（），就不能写super（）了，JVM也不会自动添加super（）
    //在老版本当中this（）必须写在构造方法的第一行，不能写在其他位置，否则编译器会报错

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name+","+stu.age);
    }

}
