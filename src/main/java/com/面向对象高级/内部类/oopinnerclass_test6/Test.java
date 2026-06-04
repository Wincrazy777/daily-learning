package com.面向对象高级.内部类.oopinnerclass_test6;

public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student();
        goSwimming(s);
    }


    //调用这个方法的时候，需要传递Swim这个接口的实现类对象
    public static void goSwimming(Swim s){
        s.swim();
    }
}

   
