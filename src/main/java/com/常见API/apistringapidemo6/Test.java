package com.常见API.apistringapidemo6;

public class Test {

    public static void main(String[] args) {
        //计算程序运算的时间 （ms）
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            sb.append("abc");
        }
        System.out.println(s);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
