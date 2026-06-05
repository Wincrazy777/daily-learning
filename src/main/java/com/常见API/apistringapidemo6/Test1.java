package com.常见API.apistringapidemo6;

public class Test1 {

    public static void main(String[] args) {
        //创建StringBuilder容器不含任何内容
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        //创建带参构造
        StringBuilder sb2 = new StringBuilder("abc");
        //添加数据
        sb2.append("def");
        //反转数据
        sb2.reverse();
        //获取长度
        sb2.length();
        //转回字符串
        String res = sb2.toString();
        System.out.println(sb2);
        System.out.println(res);

    }

}
