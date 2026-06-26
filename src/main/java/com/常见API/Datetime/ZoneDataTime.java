package com.常见API.Datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDataTime {

    public static void main(String[] args) {
        //获取当前时区的时间
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //获取指定时区的当前时间
        ZonedDateTime time1 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);
        ZonedDateTime time2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(time2);

        //年月日时分秒纳秒指定
        ZonedDateTime of1 = ZonedDateTime.of(2024, 6, 26, 18, 30, 0, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println("of: " + of1);

        //通过Instant+时区的方式获取时间对象
        java.time.Instant instant = java.time.Instant.now();
        ZonedDateTime fromInstant = instant.atZone(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime fromInstant2 = instant.atZone(ZoneId.of("America/New_York"));
        System.out.println("Instant+上海时区: " + fromInstant);
        System.out.println("Instant+纽约时区: " + fromInstant2);

        //修改时间系列的方法
        ZonedDateTime time3 = now.withYear(2025);
        ZonedDateTime time4 = now.withMonth(1);
        ZonedDateTime time5 = now.withDayOfMonth(1);
        ZonedDateTime time6 = now.withHour(0);
        ZonedDateTime time7 = now.withMinute(0);
        ZonedDateTime time8 = now.withSecond(0);
        System.out.println("withYear: " + time3);
        System.out.println("withMonth: " + time4);
        System.out.println("withDayOfMonth: " + time5);
        System.out.println("withHour: " + time6);
        System.out.println("withMinute: " + time7);
        System.out.println("withSecond: " + time8);

        //减少时间系列的方法
        ZonedDateTime minus1 = now.minusYears(1);
        ZonedDateTime minus2 = now.minusMonths(2);
        ZonedDateTime minus3 = now.minusDays(10);
        ZonedDateTime minus4 = now.minusHours(1);
        System.out.println("minusYears: " + minus1);
        System.out.println("minusMonths: " + minus2);
        System.out.println("minusDays: " + minus3);
        System.out.println("minusHours: " + minus4);

        //增加时间系列的方法
        ZonedDateTime plus1 = now.plusYears(1);
        ZonedDateTime plus2 = now.plusMonths(2);
        ZonedDateTime plus3 = now.plusDays(10);
        ZonedDateTime plus4 = now.plusHours(1);
        System.out.println("plusYears: " + plus1);
        System.out.println("plusMonths: " + plus2);
        System.out.println("plusDays: " + plus3);
        System.out.println("plusHours: " + plus4);
    }
}
