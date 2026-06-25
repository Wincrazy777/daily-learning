package com.常见API.Runtime;

import java.io.IOException;

public class Runtimetest1 {

    public static void main(String[] args) throws IOException {
        //1.获取runtime的对象
        //Runtime r1 = Runtime.getRuntime();
        //Runtime r2 = Runtime.getRuntime();

        //2.exit 停止虚拟机
        //Runtime r1 = Runtime.getRuntime();
        //r1.exit(0);
        //3.获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4.JVM能从系统中获取总内存大小(byte)
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //5.已经获取的总内存大小，单位byte字节
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //6.剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //7.运行cmd命令
        //该方法在java18后结束了
        //Runtime.getRuntime().exec("notepad");
        new ProcessBuilder("notepad").start();

        //关机代码
        new ProcessBuilder("shutdown -s -t 3600").start();
        new ProcessBuilder("shutdown -a").start();

        //两次get方法，获取的是同一个对象
        //System.out.println(r1==r2);
    }

}
