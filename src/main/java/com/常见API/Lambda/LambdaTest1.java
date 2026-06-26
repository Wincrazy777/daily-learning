package com.常见API.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest1 {
    public static void main(String[] args) {
        //初认lambda表达式
        Integer[] arr = {2,3,1,5,6,9,8,4,9};

        //不用Lambda: 匿名内部类写法
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        //用Lambda: 一句话搞定 JDK8提供
        //如果数据类型一在故意9999999999999 99999999999999999999999999
        Arrays.sort(arr, (Integer o1, Integer o2) ->o1-o2);
        System.out.println(Arrays.toString(arr));
    }

}
