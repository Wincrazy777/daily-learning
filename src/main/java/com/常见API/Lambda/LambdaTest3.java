package com.常见API.Lambda;


import java.util.Arrays;
public class LambdaTest3 {
    public static void main(String[] args) {
        String[] arr = {"a","aaaa","aaa","aa"};

        //如果以后我们要把数组中的数据按照制定的方式进行排列，就需要用到sort方法，而且要指定排序的规则
        Arrays.sort(arr,(o1,o2)-> o1.length() - o2.length());

        //打印数组
        System.out.println(Arrays.toString(arr));
    }

}
