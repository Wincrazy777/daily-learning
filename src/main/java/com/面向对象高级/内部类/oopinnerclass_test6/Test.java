package com.面向对象高级.内部类.oopinnerclass_test6;

public class Test {
    public static void main(String[] args) {
        
        //传统方式调用goSwimming方法
        //新建java文件，在文件中新建student方法（重写，实现方法）
        //创建学生对象
        Student s = new Student();
        goSwimming(s);
        //匿名内部类的作用：少定义一个java文件
        // new 类名或接口名(){
        //     重写类/接口里面的方法
        //   }
        // 定义格式 = 没有名字的java类+继承/实现+重写方法+创建对象
        // 是一个没有名字的java类对象
        goSwimming(new Swim() {
            @Override
            public void swim() {
                System.out.println("学生正在游泳");
            }
        });

        //没有java的类：大括号
        //Swim：就是这个没有名字的java类实现了Swim接口
        //重写方法：要在大括号中重写swim所有的抽象方法
        //创建对象：new关键字的作用是后面这个合格没有名字的java类，创建了他的对象

        //整体：创建了一个Swim实现类的对象，但类没有名字
        Swim s1 = new Swim() {
            @Override
            public void swim(){
                System.out.println("学生正在游泳1");
            }
        };

    }


    //调用这个方法的时候，需要传递Swim这个接口的实现类对象
    public static void goSwimming(Swim s){
        s.swim();
    }


}

   
