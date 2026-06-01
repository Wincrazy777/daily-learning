package com.面向对象高级.多态.ooptest2;

public class Test {
    public static void main(String[] args) {
        
        Fu f = new Zi();
        //调用成员变量：编译看左边，运行看左边
        System.out.println(f.name);

        //调用成员方法：编译看左边，运行看右边
        //编译看左边：父类当中有没有这个方法，如果没有编译报错
        //运行看右边：父类的show方法被子类重写了，所以运行的时候调用子类重写的show方法
        f.show();
        f.fushow();

        //把对象转换成子类对象
        Zi z = (Zi)f;
        z.zishow();

        //创建了一个父类对象，赋值给了爷类型
        //在进行强制类型转换的时候，只能转到父类，不能转成子类
        Ye y = new Fu();
        
        if(y instanceof Fu){
            Fu ff = (Fu)y;
            ff.fushow();
            ff.show();
        }else{
            //Zi ff = (Zi)y; //编译通过，运行报错：java.lang.ClassCastException: com.面向对象高级.多态.ooptest2.Fu cannot be cast to com.面向对象高级.多态.ooptest2.Zi
            System.out.println("不能转换成Fu类型");
        }
        

    }
}
