package com.常见API.Lambda;

public class LambdaTest2 {

    public static void main(String[] args) {
        //lambda表达式只能简化函数式接口的匿名内部类的写法
        method(
                () -> {
                    System.out.println("正在游泳");
            }
        );
    }
    public static void method(Swim s){
        s.swimming();
    }


    @FunctionalInterface
    interface Swim {

        public abstract void swimming();
    }
}
