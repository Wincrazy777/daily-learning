package com.面向对象高级.多态.ooptest1;

public class StudentManager {
    //定义一个方法表示注册用户
    //参数是Person：此时可以传递Person本身的对象，同时也可以传递Person所有的子类对象
    public void register(Person person){
        System.out.println("姓名为"+person.getName()+"的用户注册成功,账号"+person.getUsername()+",密码"+person.getPassword());
        //调用work方法
        person.work();
    }

}
