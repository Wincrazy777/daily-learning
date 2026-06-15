package com.常见API.Integer;

public class Test2 {

    public static void main(String[] args) {
        //自动装箱和自动拆箱:JDK5版本出现的
        //自动装箱：JVM会自动把基本数据类型装到一个对象当中，底层调用valueOF方法

        //自动拆箱：JVM会自动的把对象中的基本数据类型给拿出来，底层intValue方法
        Integer i1 = 100; //等价于Integer i1 = Integer.valueOf(100)
        Integer i2 = 200; //等价于Integer i2 = Integer.valueOf(200)
        //等价于i1.intValue() + i2.intValue()
        //Integer i3 = Integer.valueOf(300);
        Integer i3 = i1 + i2;
        System.out.println(i3);
    }

}
