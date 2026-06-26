package com.常见API.Datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {

    public static void main(String[] args) throws ParseException {
        //1.比较两个时间
        String startStr = "2023年11月11日 00:00:00";
        String endStr = "2023年11月11日 00:10:00";
        String orderStr = "2023年11月11日 00:01:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        
        //解析三个时间得到date对象
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //获得三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //判断
        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("参加秒杀活动成功");
        } else {
            System.out.println("参加秒杀活动失败");
        }
    }

}
