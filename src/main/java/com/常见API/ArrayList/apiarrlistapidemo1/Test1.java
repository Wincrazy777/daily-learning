package com.常见API.ArrayList.apiarrlistapidemo1;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加成功：true false：添加失败
        //add方法在任意情况下，都会添加成功，永远不会失败
        //因为在java当中，有很多很多的集合  HashSet（元素要唯一） aaa（true） 第二次aaa（false）
        //设计：跟其他的集合保持统一(抽象类)

        //在集合中无法直接添加基本数据类型的(byte short int long double char boolean)
        //如果在集合里面一定要添加基本数据类型，那么可以转成其对应的包装类
        boolean res = list.add("aaa");
        System.out.println(res);
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // 把qqq添加到0索引的位置
        //如果集合长度为3 索引只能是0-3 超过最大索引值会出现报错
        //0-2已经存在的索引
        //3：把当前元素添加到集合的末尾，等同于一个参数的add方法
        list.add(3, "qqq");
        System.out.println(list);

        //根据元素的内容进行删除
        list.remove("qqq");
        //根据索引删除
        String res1 = list.remove(0);
        System.out.println(res1);

        //把1索引的数据修改为zzz
        list.set(1, "zzz");

        //获取特定索引的数据
        String res2 = list.get(1);
        System.out.println(res2);

        //遍历
        //把容器里面的数据一个一个拿出来，打印，计算，处理
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        //只能看元素，无法操作
        System.out.println(list);


    }

}
