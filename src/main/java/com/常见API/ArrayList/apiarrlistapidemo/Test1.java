package com.常见API.ArrayList.apiarrlistapidemo;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        //如果没有进行限定，此时集合可以存储任意数据类型的数据
        //ArrayList list = new ArrayList();
        //list.add("abc");
        //list.add(123);
        //list.add(3.14);
        //list.add('a');
        //System.out.println(list);

        //取出来
        //多态弊端：无法使用子类的特有行为
        //Object o = list.get(0);
        //System.out.println(o);
        //泛型：限定集合中当中的数据类型<数据类型>
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        System.out.println(list);
        // 重复的内容：JDK7的时候：左边的泛型可以省略不写，但是尖括号必须保留。
    }

}
