package com.常见API.Datetime;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest1 {

    public static void main(String[] args) {
        //calender是一个抽象类，不能直接创建对象
        //在日历对象当中月份是0-11，如果获取出来的是1，那么实际上2月
        //星期：周日是1，周一是2，周六是7
        //获取日历对象
        Calendar c = Calendar.getInstance();

        //修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);

        // 1.年 2.月 3.一年中第几周 4.一个月第几周 5.日
        int year = c.get(Calendar.YEAR);
        int mouth = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        

        //修改日历中的某个字段信息
        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DAY_OF_MONTH, 10);

        //调用方法在这个基础上增加一个月
        c.add(Calendar.MONTH, 1);

        System.out.println(year + "," + mouth + "," + date + "," + getweek(week));

    }

    public static String getweek(int index) {
        //定义一个数组，让汉字是星期几，跟1-7产生对应关系
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[index];
    }
}
