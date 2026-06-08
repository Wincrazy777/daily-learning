package com.常见API.String.demo3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // public char charAt(int index) 根据索引返回字符
        // public int length() 返回此字符串的长度
        String str = "你好你好123";
        char c = str.charAt(3);
        System.out.println(c);

        int l = str.length();
        System.out.println(l);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入字符串");
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                char cc = s.charAt(i);
                System.out.println(cc);
            }
        }

    }

}
