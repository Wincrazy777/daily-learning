package com.小游戏.puzzlegame.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFarme extends JFrame implements ActionListener {
    //按钮1
    JButton jtb1 = new JButton("啵啵");
    //按钮2
    JButton jtb2 = new JButton("fh");
    public MyJFarme(){
        this.setSize(603,680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);


        //给按钮设置位置和宽高
        jtb1.setBounds(0,0,100,50);
        jtb1.addActionListener(this);

        
        jtb2.setBounds(100,0,100,50);
        jtb2.addActionListener(this);

        //把按钮添加到整个页面中
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);






        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对按钮做判断

        //获取当前点击的按钮
        Object source = e.getSource();
        
        if(source == jtb1){
            jtb1.setSize(200,200);
        } else if (source == jtb2) {
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
