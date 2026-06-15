package com.常见API.BigInteger;

import java.math.BigInteger;

public class Test1 {

    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(100);
        BigInteger b2 = BigInteger.valueOf(100);

        //加法
        BigInteger b3 = b1.add(b2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //减法
        BigInteger b4 = b1.subtract(b2);
        System.out.println(b4);

        //乘法
        BigInteger b5 = b1.multiply(b2);
        System.out.println(b5);

        //除法 商
        BigInteger b6 = b1.divide(b2);
        System.out.println(b6);

        //除法的商和余数
        BigInteger[] arr = b1.divideAndRemainder(b2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

        //比较
        boolean b7 = b1.equals(b2);
        System.out.println(b7);
        
        //次方
        BigInteger b8 = b1.pow(2);
        System.out.println(b8);

        //最大值
        //返回最大的地址进行返回
        BigInteger max = b1.max(b2);
        System.out.println(max);

        //最小值
        BigInteger min = b1.min(b2);
        System.out.println(min);
    }

}
