package com.常见API.System;

public class Test1 {

    public static void main(String[] args) {

        //1. exit:终止当前运行的java虚拟机
        // 0 ：正常 非0：异常终止
        //System.out.println("111");
        //System.exit(0);
        //System.out.println("222");
        //2.从1971年1月1日0时0分0秒到现在的毫秒数
        long l = System.currentTimeMillis();
        System.out.println(l);

        //3.arraycopy:拷贝数组
        //第一个参数：原数组
        //第二个参数：从原数组的第几个索引开始拷贝
        //第三个参数：目的地数组
        //第四个参数：拷贝到目的地数组的哪个索引上
        //第五个参数：拷贝几个
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[6];
        System.arraycopy(arr1, 0, arr2, 0, 6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
