package com.面向对象高级.内部类.oopinnerclass_test2;

public class Outer {
    //private调用内部类的方法
    private class inner{

    }

    public inner getInstance(){
        return new inner();
    }

    //默认方式
    class inner1{

    }

    //protected方式
    protected class inner2{

    }

    //static方式 jdk16版本才可以使用
    static class inner3{

    }    

}
