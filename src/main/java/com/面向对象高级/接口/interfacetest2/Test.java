package com.面向对象高级.接口.interfacetest2;

public class Test {
    public static void main(String[] args) {
        //创建运动员或教练的对象
        PingpongSporter ps = new PingpongSporter("张三", "20");
        System.out.println(ps.getName() + "," + ps.getAge());
        ps.study();
        ps.speakEnglish();
    }

}
