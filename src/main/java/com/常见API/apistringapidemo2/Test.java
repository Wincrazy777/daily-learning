package com.常见API.apistringapidemo2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*     // 字符串比较的两个方法
        // 第一个方法：equals 方法完全一致
        String username = "zhangsan";
        String rightname = "zhangsan";
        boolean b1 = username.equals(rightname);
        System.out.println(b1);

        // 第二个方法：equalsIgnoreCase不区分大小写
        String username1="Zhangsan";
        String rightname1="zhangsan";
        boolean b2 = username1.equalsIgnoreCase(rightname1);
        System.out.println(b2);
         */
        //1.已知正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //2.让用户键盘录入登录的用户名和密码
        Scanner sc = new Scanner(System.in);
        //3.比较用户输入的用户名和密码与正确的用户名和密码是否相等
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            boolean result = username.equals(rightUsername) && password.equals(rightPassword);
            if (result == true) {
                System.out.println("登录成功");
                break;
            } else {
                // 如果登录失败，循环继续，总共有三次机会
                if (i <= 2) {
                    System.out.println("登录失败，还剩下" + (3 - i) + "次机会");
                } else {
                    System.out.println("登录失败，账号" + username + "被锁定");
                }
            }
        }
    }

}
