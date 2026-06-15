package com.常见API.Integer;

public class Test {

    public static void main(String[] args) {
        //1.构造方法
        //已经被弃制
        //每一次都会在内存中创建一个新的Integer的对象
        Integer il = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(il);
        System.out.println(i2);

        //2.静态方法
        //在-128到127范围内(数组)，会使用缓存，不会创建新的对象
        //如果不在，此时就会利用构造方法的方式去创建对象
        Integer i3 = Integer.valueOf("100");
        Integer i4 = Integer.valueOf(100);
        System.out.println(i3);
        System.out.println(i4);

        //3.直接赋值
        //就是第二种方式的简化写法
        Integer i5 = 300;
        System.out.println(i5);
    }

}
