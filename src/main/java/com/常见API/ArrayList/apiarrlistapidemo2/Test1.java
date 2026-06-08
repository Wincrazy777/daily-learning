package com.常见API.ArrayList.apiarrlistapidemo2;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("1001", "张三", 23);
        Student s2 = new Student("1002", "李四", 24);
        Student s3 = new Student("1003", "王五", 25);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
        }
        //5.查找对应的ID
        int index = findStudent("1001", list);
        System.out.println(index);
    }

    //根据id查找学生的信息
    //形参：id. ArrayList<Student> list
    //返回值：int
    public static int findStudent(String id, ArrayList<Student> list){
        // 遍历集合得到集合中的每一个元素（学生对象）.判断元素的ID跟要查找的ID是否一致
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //判断学生的ID是否与要查找的ID一致
            //利用前一个方法的结构，继续调用后面的方法
            if(stu.getId().equals(id)){
                return i;
            }
        }
        //只有当前循环结束了，才返回-1
        return -1;
    }

}
