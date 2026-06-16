package com.常见API.BigDecimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //1.构造方法
        char[] chars = {'1','.','5'};
        BigDecimal bd1 = new BigDecimal(chars);
        System.out.println(bd1);

        BigDecimal bd2 = new BigDecimal("123");
        System.out.println(bd2);

        //2.利用静态变量获取对象
        //0-10提前创建号，放入到数组当中
        BigDecimal bd4  = BigDecimal.valueOf(0.225);
        System.out.println(bd4);
    }

}
