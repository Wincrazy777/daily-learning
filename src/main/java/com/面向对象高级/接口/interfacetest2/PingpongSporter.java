package com.面向对象高级.接口.interfacetest2;

public class PingpongSporter extends Sporter implements English{
    public PingpongSporter() {
    }

    public PingpongSporter(String name, String age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

}
