package com.常见API.apistringapidemo1;

public class Test {
    public static void main(String[] args) {
        //字符串的内容是不可变的，它的对象在创建后不能被更改
        String s = "abc";
        System.out.println(s);

        //new+构造方法的方式创建字符串对象
        //new+空参构造
        String s1 = new String();  
        System.out.println("@"+s1+"!"); //""

        //new+有参构造
        //根据传递字符串的内容，创造一个新的字符串对象
        String s2 = new String(s);
        System.out.println(s2); 

        //new+有参构造（字符数组）
        char[] chs = {'a','b','c','d','e'};
        String s3 = new String(chs);
        System.out.println(s3);
        
        //new+有参构造（字节数组）
        //ASCII码表
        byte[] bytes = {97,98,99,100,101};
        String s4 = new String(bytes);
        System.out.println(s4); 


    }

}
