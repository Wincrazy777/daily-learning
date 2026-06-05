package com.常见API.apistringapidemo7;

import java.util.Scanner;

public class Test3Case1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入字符串");
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                //打印字符不换行
                System.out.print(c);
                if ((i + 1) % 8 == 0) {
                    //每8个字符换一行
                    System.out.println();
                }
            }
            //处理最后一行不足8位的补零
            int remainder = str.length() % 8;
            if (remainder != 0) {
                int count = 8 - remainder;
                for (int j = 0; j < count; j++) {
                    System.out.print("0");
                }
                System.out.println();
            }
        }

    }
}
