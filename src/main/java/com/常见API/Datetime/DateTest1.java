package com.常见API.Datetime;

import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) {
        //1.创建对象表示一个时间
        Date d1 = new Date();
        System.out.println(d1);

        //2.创建对象表示一个指定的时间
        Date d2 = new Date(0L);
        System.out.println(d2);

        //setTime 修改时间
        //1000毫秒
        d2.setTime(1000L);
        System.out.println(d2);

        //getTime获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time);

    }

}
