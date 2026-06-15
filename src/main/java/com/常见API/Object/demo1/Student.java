package com.常见API.Object.demo1;

import java.util.Objects;

public class Student {

    private int age;
    private String name;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 父类中的方法不能满足子类的需求了，重写
    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ",age=" + age
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        //getClass() != obj.getClass()
        //比较的就是s1和s2是不是同一个类型的
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        //传递过来的参数不是null，调用者和参数是同一种类型的student
        Student student = (Student) obj;
        //比较两个对象的属性值是否相等
        //先比较年龄 return age == student.age
        //Objects:操作对象的工具类
        //Objects.equals(this.name, student.name); 调用的是对象工具类Objects里面的静态方法equals
        //把两个字符串传递过去的
        //这个静态方法的底层，又调用了string的equals方法
        return age == student.age && Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

}
