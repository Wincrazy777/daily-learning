package com.常见API.String.demo7;

import java.util.Scanner;

public class Test3Case2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入字符串");
            String str = sc.next();

            //直接在str的后面补0
            //计算最后一行有多少个字符
            int lastLineCount =str.length() % 8;
            //计算最后一行补多少个0
            int count = 8 - lastLineCount;
            //获取最后一行补的0
            if(count !=8){
                String line = "00000000".substring(0,count);
                //把最后一行补的0拼接导字符串的后面
                str = str + line;
            }
            System.out.println(str);
            //每8个打印一行
            // i +=8 第一行：0索引开始
            //       第二行：8索引开始      
            for (int i = 0; i < str.length(); i+=8) {
                //每8个截取一次
                String res = str.substring(i,i+8);
                System.out.println(res);
            }

        }

    }
}
