package com.常见API.String.demo5;

public class Test {

    public static void main(String[] args) {
        //是否包含
        String str = "abcdefg";
        boolean b = str.contains("abc");
        System.out.println(b);

        //判断开头，结尾
        boolean b2 = str.startsWith("abc");
        boolean b3 = str.startsWith("bca", 1);
        System.out.println(b2);
        System.out.println(b3);
        boolean b4 = str.endsWith(".txt");
        System.out.println(b4);

        //查找
        //第一次出现的索引,为-1时值不存在
        int i1 = str.indexOf(97);
        System.out.println(i1);
        //倒序查找
        int i2 = str.lastIndexOf(97);
        System.out.println(i2);

        int i3 = str.indexOf("A");
        System.out.println(i3);  //-1

        //判断是否为空
        boolean empty = str.isEmpty();
        System.out.println(empty);

        //转字符数组
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //大小写转换
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);

        //去除头尾空格
        String str2 = "a b c";
        String trim = str2.trim();
        System.out.println(trim);

    }

}
