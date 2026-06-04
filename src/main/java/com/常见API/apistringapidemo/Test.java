package com.常见API.apistringapidemo;

//定位Random的位置
//扩展：在什么情况下，我不需要导包
//      1.本包中的类
//      2.使用java.long(核心)包下的类
//      其他所有情况下，都需要导包
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //查看API帮助文档，使用Random类中获取随机小数的方法
        //创建Random的对象
        Random r =new Random();
        //调用方法获取一个随机的小数
        //0到1之间的随机小数
        double num1 = r.nextDouble();
        System.out.println(num1);
        double num2 = r.nextDouble(9);
        System.out.println(num2);
        System.out.println("=============");
        for (int i = 0; i < 100; i++) {
            double num3 = r.nextDouble(5,10);
            System.out.println(num3);
        }


    }

}
