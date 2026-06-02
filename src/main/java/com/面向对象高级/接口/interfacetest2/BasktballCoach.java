package com.面向对象高级.接口.interfacetest2;

public class BasktballCoach extends Coach implements English {
    public BasktballCoach() {
    }

    public BasktballCoach(String name, String age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("篮球教练教别人说英语");
    }

}
