package com.常见API.apistringapidemo3;

public class Test3 {

    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 2, 3, 4, 5};
        String s = ArrayUtil.arrayToString(arr);
        System.out.println(s);
    }
}
