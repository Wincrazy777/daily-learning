package com.常见API.String.demo7;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        //小写
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('a' + i);
        }
        //大写
        for (int i = 0; i < 26; i++) {
            arr[i +26] = (char) ('A' + i);
        }
        //在数组中随机抽取
        Random r = new  Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            sb.append(arr[index]);
        }
        int num = r.nextInt(10);
        sb.append(num);

        //把最后一个数字跟前面的字母进行交换（位置：随机的）
        char[] result = sb.toString().toCharArray();
        for (int i = 0; i < result.length; i++) {
            int index = r.nextInt(result.length);
            char temp = result[i];
            result[i] = result[index];
            result[index] = temp;
        }
        //转回字符串
        String resultStr = new String(result);
        System.out.println("验证码："+resultStr);
    }
}
