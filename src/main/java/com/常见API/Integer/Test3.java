package com.常见API.Integer;

public class Test3 {

    public static void main(String[] args) {
        int i1 = 100;
        Integer i2 = 200;// 触发自动装箱
        //当基本数据类型i1+包装类i2，他们在相加的时候，就出发了自动拆箱
        //触发自动装箱
        Integer i3 = i1 + i2;
        System.out.println(i3);
    }

}
