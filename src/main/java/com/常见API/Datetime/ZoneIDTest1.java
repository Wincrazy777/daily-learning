package com.常见API.Datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIDTest1 {

    public static void main(String[] args) {
        //获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定的时区
        ZoneId of = ZoneId.of("Asia/Shanghai");
        System.out.println(of);

        //获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now);

        //根据毫秒值获取Instant对象(标准时间)
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(1L, 100000000L);
        System.out.println(instant3);

        //指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //isXXX 判断
        //isBefore:判断调用者代表的时间是否在参数之前
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);
        //isAfter:判断调用者代表的时间是否在参数之后
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //减少时间的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);
        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);

        //增加时间的方法
        Instant instant8 = Instant.ofEpochMilli(3000L);
        System.out.println(instant8);
        Instant instant9 = instant8.plusSeconds(1);
        System.out.println(instant9);

    }

}
