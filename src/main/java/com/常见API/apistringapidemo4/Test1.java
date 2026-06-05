package com.常见API.apistringapidemo4;

import java.io.PrintStream;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //设置中文不乱码
        System.setOut(new PrintStream(System.out, true, "GBK"));
        String str = "FK,TMD";
        String res = str.replace("TMD", "***");
        System.out.println(res);


        //1.定义一个敏感词库
        String[] arr = {"TMD", "FK", "NND","LJ"};
        try(Scanner sc = new Scanner(System.in, "GBK")){
            System.out.println("请输入你想说的话：");
            String msg = sc.next();
            // 增强 for 循环：依次取出数组中的每个元素赋给变量 s
            for (String s : arr) {
                msg = msg.replace(s, "***");
            }
            System.out.println(msg);

        }

    }

}
