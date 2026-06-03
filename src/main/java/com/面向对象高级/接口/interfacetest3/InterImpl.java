package com.面向对象高级.接口.interfacetest3;

public class InterImpl implements InterA,InterB{

    public InterImpl() {
    }
    @Override
    public void method1(){
        System.out.println("实现类重写的method1方法");
    }
    @Override
    public void method2(){
        System.out.println("实现类重写的method2方法");
    }

    @Override
    public void function() {
        System.out.println("重写接口里面的function方法");
    }
    

}
