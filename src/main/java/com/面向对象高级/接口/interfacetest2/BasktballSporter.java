package com.面向对象高级.接口.interfacetest2;

public class BasktballSporter extends Sporter implements English {
    public BasktballSporter() {
    }

    public BasktballSporter(String name, String age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("篮球运动员说英语");
    }

}
