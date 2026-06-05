package com.常见API.apistringapidemo7;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        while (true) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("请输入一个字符串");
                String str = sc.next();
                if (str.equals("拜拜")) {
                    // 程序停止运行
                    System.out.println("程序停止运行");
                    break;
                } else {
                    StringBuilder sb = new StringBuilder(str);
                    sb.reverse();
                    System.out.println(sb.toString());
                }
            }
        }
    }

}
