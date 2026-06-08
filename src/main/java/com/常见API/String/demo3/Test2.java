package com.常见API.String.demo3;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入字符串");
            String str = sc.next();

            //遍历字符串中得到的每一个字符
            int upperCount =0;
            int lowerCount =0;
            int numberCount =0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    lowerCount++;
                } else if (c >= 'A' && c <= 'Z') {
                    upperCount++;
                } else if (c >= '0' && c <= '9') {
                    numberCount++;
                } else {
                    System.out.println("其他");
                }
            }
            System.out.println("大写字符" + upperCount);
            System.out.println("小写字符" + lowerCount);
            System.out.println("数字字符" + numberCount);

        }

    }
}
