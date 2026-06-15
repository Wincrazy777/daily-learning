package com.常见API.Integer;

public class Test1 {
    public static void main(String[] args) {
        //1.把基本数据类型变成包装类
        Integer i = Integer.valueOf(200);
        System.out.println(i);

        // 2.把包装类变回基本数据类型int
        int num = i.intValue();
        System.out.println(num);

        //3.把字符串的形式变成int类型
        //如果字符串里面有非数字的类型代码会报错
        int num2 = Integer.parseInt("123");
        System.out.println(num2);

        //4.获取2进制，8进制，16进制
        int num3 = 100;
        String binary = Integer.toBinaryString(num3);
        System.out.println(binary);
        String oct = Integer.toOctalString(num3);
        System.out.println(oct);
        String hex = Integer.toHexString(num3);
        System.out.println(hex);
    }

}
