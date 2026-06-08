package com.常见API.String.demo7;

public class ArrayUtil2 {

    public static String arrayToString2(int[] arr) {
        //创建
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
                sb.append("]");
            } else {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
