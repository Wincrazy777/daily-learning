package com.常见API.apistringapidemo7;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        String str = "abcd";
        char[] arr = str.toCharArray();

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            //依次得到数组中的每一个元素，跟随机索引上的字符进行位置交换
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        //4.把打乱之后的字符数组转回字符串
        String result = new String(arr);
        System.out.println(result);
    }

}
