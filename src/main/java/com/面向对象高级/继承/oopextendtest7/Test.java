package com.面向对象高级.继承.oopextendtest7;

public class Test {
    public static void main(String[] args) {
        BachelorStudent bs = new BachelorStudent("张三", 20, "大一");
        bs.study();
        bs.sleep();
        MasterStudent ms = new MasterStudent("李四", 25, "研一");
        ms.study();
        ms.sleep();
        GeneralTeacher gt = new GeneralTeacher("王五", 30, "数学");
        gt.teach();
        MajorTeacher mt = new MajorTeacher("赵六", 35, "物理");
        mt.teach();
    }

}
