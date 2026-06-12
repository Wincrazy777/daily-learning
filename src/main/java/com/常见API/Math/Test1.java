package com.常见API.Math;

public class Test1 {

    public static void main(String[] args) {
        isPrime(16);
    }

    public static void isPrime(int number) {
        //2-平方根
        for (int i = 2; i < Math.sqrt(number); i++) {
            System.out.println(i);
            if (number % i == 0) {
                System.out.println(number + "不是质数");
                return;
            }
        }
        System.out.println(number + "是质数");

    }
}
