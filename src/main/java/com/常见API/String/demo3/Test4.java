package com.常见API.String.demo3;

public class Test4 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String substr = str.substring(1, 3);
        String substring = str.substring(1);
        System.out.println(substr);
        System.out.println(substring);


        //只保留用户名的第一个字符，后面用三个***替代
        String username="zhangsan";
        CharSequence subSequence = username.subSequence(0, 1);
        System.out.println("用户名："+subSequence+"***");

    }

}
