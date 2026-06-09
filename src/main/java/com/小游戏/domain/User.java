package com.小游戏.domain;

import java.util.Random;

public class User {

    private Integer id;
    private String username;
    private String password;
    private boolean status;

    public User() {
        id = createID();
        //此时的status是默认值为false的
        status = true;
    }

    public User(Integer id, String username, String password, boolean status) {
        id = createID();
        this.username = username;
        this.password = password;
        status = true;
    }

    public static Integer createID() {
        Random r = new Random();
        int num = r.nextInt(90000) + 10000;
        return num;
        //StringBuilder sb = new StringBuilder();
        //for (int i = 0; i < 5; i++) {
        //    int num = r.nextInt(10);
        //    sb.append(num);
        //}
        //把字符串修改成包装类Integer
        //return Integer.valueOf(sb.toString());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //布尔类型变量的特点  is
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
