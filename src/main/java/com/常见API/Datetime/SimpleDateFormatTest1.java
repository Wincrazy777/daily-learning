package com.常见API.Datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {

    public static void main(String[] args) throws ParseException {
        //利用空参构造simpledateformat对象，默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);

        //利用带参构造创建simpledateformat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH时:mm:分:ss秒 E");
        String str3 = sdf3.format(d1);
        System.out.println(str3);

        //定义一个字符串表示时间
        String str = "2023-11-11 11:11:11";
        //利用空参构造创建simpledateformat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date.getTime());
    }

}
