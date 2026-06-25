package com.小游戏.puzzlegame.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603,680);
        jFrame.setTitle("事件演示");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);



        //创建一个按钮对象
        JButton jtb = new JButton("点我");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jtb:组件对象，表示你要给哪个组件添加事件
        //addActionListener:我要给组件添加哪个事件监听（动作监听鼠标左键点击，空格）
        //参数：表示时间被触发之后要执行的代码
        //jtb.addActionListener(new MyActionListioner());
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("别点");
            }
        });

        //把按钮添加到界面中
        jFrame.getContentPane().add(jtb);









        jFrame.setVisible(true);
    }
}
