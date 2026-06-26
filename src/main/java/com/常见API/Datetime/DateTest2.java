package com.常见API.Datetime;

import java.util.Date;
import java.util.Random;

public class DateTest2 {
    public static void main(String[] args) {
        getTime();


        //定义任意两个date对象，比较一下哪个时间在前，哪个时间在后
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);
        if(d1.getTime() > d2.getTime()){
            System.out.println("d1在后");
        }else if(d1.getTime() < d2.getTime()){
            System.out.println("d2在后");
        }else{
            System.out.println("一样");
        }
    }

    private static void getTime() {
        //打印时间原点开始一年之后的时间
        //创建一个对象，表示时间原点
        Date d1 = new Date(0L);

        //获取d1时间的毫秒值
        long time = d1.getTime();

        //+一年的毫秒值
        time = time + 1000L * 60 * 60 * 24 * 365;

        //把计算之后的时间设置回d1
        d1.setTime(time);
        System.out.println(d1);
    }

}
