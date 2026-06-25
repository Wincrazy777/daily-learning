package com.小游戏.puzzlegame.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

public class RegesterJFrame extends JFrame implements MouseListener {

    HashMap<String, String> userInfo = LoginJFarme.getUserInfo();

    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JPasswordField rePassword = new JPasswordField();

    private ImageIcon img(String path) {
        return new ImageIcon(getClass().getResource("/puzzlegame/image/" + path));
    }

    public RegesterJFrame(){
        this.setSize(488,500);
        this.setTitle("拼图 注册");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        //用户名输入框
        username.setBounds(180, 145, 170, 30);
        this.getContentPane().add(username);

        //密码输入框
        password.setBounds(180, 215, 170, 30);
        this.getContentPane().add(password);

        //确认密码输入框
        rePassword.setBounds(180, 285, 170, 30);
        this.getContentPane().add(rePassword);

        //注册按钮
        JLabel registerButton = new JLabel(img("register/注册按钮.png"));
        registerButton.setBounds(100, 350, 90, 40);
        registerButton.addMouseListener(this);
        this.getContentPane().add(registerButton);

        //重置按钮
        JLabel resetButton = new JLabel(img("register/重置按钮.png"));
        resetButton.setBounds(260, 350, 90, 40);
        resetButton.addMouseListener(this);
        this.getContentPane().add(resetButton);

        //用户名图片
        JLabel usernameLabel = new JLabel(img("register/注册用户名.png"));
        usernameLabel.setBounds(80, 150, 80, 20);
        this.getContentPane().add(usernameLabel);

        //密码图片
        JLabel passwordLabel = new JLabel(img("register/注册密码.png"));
        passwordLabel.setBounds(80, 220, 80, 20);
        this.getContentPane().add(passwordLabel);

        //再次输入密码图片
        JLabel rePasswordLabel = new JLabel(img("register/再次输入密码.png"));
        rePasswordLabel.setBounds(60, 290, 110, 20);
        this.getContentPane().add(rePasswordLabel);

        //背景图片
        JLabel background = new JLabel(img("register/background.png"));
        background.setBounds(0, 0, 470, 460);
        this.getContentPane().add(background);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel source = (JLabel) e.getSource();
        String iconStr = source.getIcon().toString();

        if (iconStr.contains("注册按钮")) {
            String user = username.getText();
            String pwd = new String(password.getPassword());
            String rePwd = new String(rePassword.getPassword());

            if (user.isEmpty() || pwd.isEmpty()) {
                JOptionPane.showMessageDialog(this, "用户名或密码不能为空");
                return;
            }
            if (!pwd.equals(rePwd)) {
                JOptionPane.showMessageDialog(this, "两次密码不一致");
                return;
            }
            if (userInfo.containsKey(user)) {
                JOptionPane.showMessageDialog(this, "用户名已存在");
                return;
            }

            userInfo.put(user, pwd);
            JOptionPane.showMessageDialog(this, "注册成功");
            this.setVisible(false);
            new LoginJFarme();
        } else {
            username.setText("");
            password.setText("");
            rePassword.setText("");
        }
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
