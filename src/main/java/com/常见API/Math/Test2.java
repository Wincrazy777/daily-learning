package com.常见API.Math;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt(); //123
            int temp = num;
            int sum = 0;

            //把num看作一个字符串，字符串的长度就算数字的位数
            int len = (num + "").length();

            //获取到num上的每一位
            //获取到num最右边的数字
            //去掉3 num =12
            //获取到num最右边的数字
            //num =1
            //当num =0的时候循环结束
            while (num != 0) {
                //获取到num最右边的数字 
                int lastNumber = num % 10;
                //去掉右边的数字
                num = num / 10;
                //求lastNumber的幂次方,并相加
                sum = (int) (sum + Math.pow(lastNumber, len));
            }
            System.out.println(sum);
            if (sum == temp) {
                System.out.println("自幂数");
            } else {
                System.out.println("非自幂数");
            }
        }

    }

}
