package com.常见API.Math;

public class Test {
    public static void main(String[] args) {
        //1.不能创建Math类的对象
        //abs获取参数绝对值
        int num1 = Math.abs(-1);
        System.out.println(num1);
        
        //ceil向上取整
        System.out.println(Math.ceil(10.11));

        //floor向下取整
        System.out.println(Math.floor(10.11));

        //round四舍五入
        //如果负数的小数位，刚刚好是.5的时候，采取舍去的操作
        System.out.println(Math.round(10.11));
        System.out.println(Math.round(10.55));
        System.out.println("=====================");
        System.out.println(Math.round(-10.11)); //-10
        System.out.println(Math.round(-10.55)); //-11

        //max
        System.out.println(Math.max(10, 20));

        //min
        System.out.println(Math.max(10, 20));

        //pow 返回a的b次幂
        System.out.println(Math.pow(2, 3));
        //开根号
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(4, -0.5));
        //平方根 立方根1/3
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(27));

        // random 获取随机数
        // [0.0-1.0]
        System.out.println(Math.random());
        
    }

}
