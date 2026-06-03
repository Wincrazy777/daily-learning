package com.面向对象高级.接口.interfacetest2;

public class BasketballCoach extends Coach implements English {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, String age) {
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
