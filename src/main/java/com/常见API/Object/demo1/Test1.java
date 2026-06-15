package com.常见API.Object.demo1;

public class Test1 {

    public static void main(String[] args) {
        //1.创建对象
        Student s = new Student(23, "张三");
        String str = s.toString();
        //Object类中的源代码：返回对象的内存地址
        //getClass():调用者的字节码文件
        //getName():这个字节码文件的名字
        //@：间隔符号
        //hashCode:获取对象的内存地址
        //Integer：类名
        //toHexString:把内存地址变成16进制的表现形式
        System.out.println(str);

        //out是System里面的一个静态变量，默认初始化值为null
        // 程序启动之后，会进行赋值，所以在打印的时候会把数据打印在控制台上
        //print:方法
        //s:其实就是调用方法的实参
        System.out.println(s);

        //输出语句的运行过程：
        //    在打印的时候，printIn方法的内部调用了对象的toString方法
        //    如果Student中没有重写这个方法，就会调用Object中的toString方法，打印对象的内存地址
        //习惯：一般重写方法
    }

}
