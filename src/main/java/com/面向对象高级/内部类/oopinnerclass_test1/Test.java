package com.面向对象高级.内部类.oopinnerclass_test1;

public class Test {
    public static void main(String[] args) {
        // 1. 创建外部类对象
        Car car = new Car();
        car.carBrand = "宝马";
        car.carAge = 2;
        car.carColor = "黑色";

        // 2. 通过外部类对象创建成员内部类对象
        // 外部类名.内部类名 对象名 = 外部类对象.new 内部类名();
        Car.Engine engine = car.new Engine();
        engine.engineBrand = "宝马发动机";
        engine.engineColor = "银色";

        // 3. 打印信息
        System.out.println("汽车品牌：" + car.carBrand);
        System.out.println("汽车年龄：" + car.carAge);
        System.out.println("汽车颜色：" + car.carColor);
        System.out.println("发动机品牌：" + engine.engineBrand);
        System.out.println("发动机颜色：" + engine.engineColor);
    }
}
