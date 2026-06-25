package com.小游戏.puzzlegame.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListioner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("代码被点击了");
    }
}
