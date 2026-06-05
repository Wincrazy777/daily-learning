package com.常见API.apistringapidemo3;

public class ArrayUtil {
    private ArrayUtil(){

    }

    public static String arrayToString(int[] arr) {
        //定义一个字符串来拼接
        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str = str + arr[i] + "]";
            } else {
                System.out.println(arr[i]);
                str = str + arr[i] + ",";
            }
        }
        return str;
    }

}
