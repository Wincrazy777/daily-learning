package com.小游戏.puzzlegame.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

public class LoginJFarme extends JFrame implements MouseListener {

    private static HashMap<String, String> userInfo = new HashMap<>();

    static {
        userInfo.put("admin", "12345");
    }

    public static HashMap<String, String> getUserInfo() {
        return userInfo;
    }

    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel loginButton = new JLabel();
    JLabel registerButton = new JLabel();

    private ImageIcon img(String path) {
        return new ImageIcon(getClass().getResource("/puzzlegame/image/" + path));
    }

    public LoginJFarme(){
        this.setSize(488,430);
        this.setTitle("拼图 登录");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        //用户名输入框
        username.setBounds(180, 130, 170, 30);
        this.getContentPane().add(username);

        //密码输入框
        password.setBounds(180, 190, 170, 30);
        this.getContentPane().add(password);

        //登录按钮
        loginButton = new JLabel(img("login/登录按钮.png"));
        loginButton.setBounds(133, 285, 90, 40);
        loginButton.setName("login");
        loginButton.addMouseListener(this);
        this.getContentPane().add(loginButton);

        //注册按钮
        registerButton = new JLabel(img("login/注册按钮.png"));
        registerButton.setBounds(256, 285, 90, 40);
        registerButton.setName("register");
        registerButton.addMouseListener(this);
        this.getContentPane().add(registerButton);

        //用户名图片
        JLabel usernameLabel = new JLabel(img("login/用户名.png"));
        usernameLabel.setBounds(100, 135, 60, 20);
        this.getContentPane().add(usernameLabel);

        //密码图片
        JLabel passwordLabel = new JLabel(img("login/密码.png"));
        passwordLabel.setBounds(100, 195, 60, 20);
        this.getContentPane().add(passwordLabel);

        //背景图片
        JLabel background = new JLabel(img("login/background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel source = (JLabel) e.getSource();
        String user = username.getText();
        String pwd = new String(password.getPassword());

        if ("login".equals(source.getName())) {
            if (userInfo.containsKey(user) && userInfo.get(user).equals(pwd)) {
                JOptionPane.showMessageDialog(this, "登录成功");
                this.setVisible(false);
                try {
                    new GameJframe();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "加载游戏失败: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "用户名或密码错误");
            }
        } else {
            this.setVisible(false);
            new RegesterJFrame();
        }
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
