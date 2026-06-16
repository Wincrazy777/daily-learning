package com.常见API.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("100");
        BigDecimal b2 = new BigDecimal("3.0");
        
        //加
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);
        
        //减
        BigDecimal b4 = b1.subtract(b2);
        System.out.println(b4);
        
        //乘法
        BigDecimal b5 = b1.multiply(b2);
        System.out.println(b5);
        
        //除法(精确)
        //BigDecimal b6 = b1.divide(b2);
        //System.out.println(b6);

        //除法 余数
        BigDecimal[] arr = b1.divideAndRemainder(b2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //如果我不想看商和余数，就想看到整个数字
        //默认保留一位小数
        BigDecimal b7 = b1.divide(b2, RoundingMode.HALF_UP);
        System.out.println(b7);

        //默认保留两位小数
        BigDecimal b8 = b1.divide(b2,2,RoundingMode.HALF_UP);
        System.out.println(b8);

        //比较
        boolean b9 = b1.equals(b2);
        System.out.println(b9);
        
        //次方
        BigDecimal b10 = b1.pow(2);
        System.out.println(b10);

        //最大值
        //返回最大的地址进行返回
        BigDecimal max = b1.max(b2);
        System.out.println(max);

        //最小值
        BigDecimal min = b1.min(b2);
        System.out.println(min);
    }

}
