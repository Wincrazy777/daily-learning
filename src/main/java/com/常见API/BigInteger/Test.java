package com.常见API.BigInteger;

import java.math.BigInteger;

public class Test {

    public static void main(String[] args) {
        //1.利用构造方法获取对象
        //每一次都是创建了一个新的biginteger对象
        BigInteger b1 = new BigInteger("999999999999999999999999999999999999");
        System.out.println(b1);

        //2.利用静态方法获取对象
        // -16-16 33个对象
        BigInteger bd3 = BigInteger.valueOf(10);
        BigInteger bd4 = BigInteger.valueOf(10);
        System.out.println(bd3 == bd4);

        //3.直接赋值,没有这种方式的
        // 包装类和String可以直接赋值
    }
}
