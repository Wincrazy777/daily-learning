package com.面向对象高级.接口.interfacetest2;

public class PingpongCoach extends Coach implements English{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, String age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教你打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练教你说英语");
    }

}
