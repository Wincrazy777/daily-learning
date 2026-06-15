package com.常见API.Object.demo1;

public class Test2 {

    public static void main(String[] args) {
        //1.创建两个对象
        Student s1 = new Student(23, "张三");
        Student s2 = new Student(23, "张三");

        /*
        this:表示方法调用的内存地址
        obj：传递实参的内存地址
        基本数据类型：变量中记录的数据是否相等
        引用数据类型：变量中记录的内存地址是否相等
        需要重写
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */
        //2.比较两个对象是否相等
        boolean b = s1.equals(s2);
        System.out.println(b);
    }

}
