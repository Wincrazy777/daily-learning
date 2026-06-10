package com.小游戏.UI;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.小游戏.domain.User;

public class Login {

    //方法表示的就是登录注册的主页面（控制台形式展示）
    public void start() {
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║                                          ║");
            System.out.println("║      ██     ██                           ║");
            System.out.println("║      ██     ██                           ║");
            System.out.println("║      █████████   欢迎来到                 ║");
            System.out.println("║      ██     ██   文字格斗游戏             ║");
            System.out.println("║      ██     ██                           ║");
            System.out.println("║                                          ║");
            System.out.println("║    ╔══════════════════════════╗          ║");
            System.out.println("║    ║  1. 登录                 ║          ║");
            System.out.println("║    ║  2. 注册                 ║          ║");
            System.out.println("║    ║  3. 退出                 ║          ║");
            System.out.println("║    ╚══════════════════════════╝          ║");
            System.out.println("║                                          ║");
            System.out.println("╚══════════════════════════════════════════╝");
            try (Scanner sc = new Scanner(System.in)) {
                String choose = sc.next();
                switch (choose) {
                    case "1" ->
                        login(list);
                    case "2" ->
                        register(list);
                    case "3" -> {
                        System.out.println("用户点击退出，欢迎下次使用");
                        System.exit(0);
                    }
                    default ->
                        System.out.println("输入有误，请重新输入");
                }
            }
        }
    }

    //登录逻辑
    public static void login(ArrayList<User> list) {
        //1.判断用户名是否存在
        //      不存在：提示未注册
        //        存在：账户被禁用
        //        存在：验证验证码（用机器直接注册）
        //        验证密码是否正确（三次）

        //1.键盘录入用户名
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入用户名");
            sc.next();
            String username = sc.next();

            //判断用户名是否存在
            if (!contains(list, username)) {
                System.out.println("用户名" + username + "未注册，请先注册,请先注册再登录");
                return;
            }
            //存在：禁用，提示联系客服
            int index = findIndex(list, username);
            User u = list.get(index);
            if (!u.isStatus()) {
                System.out.println("账户" + username + "被禁用");
                return;
            }
            //4.让用户继续录入验证码和密码
            // 验证密码是否正确
            String rightpasswd = u.getPassword();
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入密码：");
                String passwd = sc.next();
                while (true) {
                    System.out.println("请输入验证码");
                    String code = sc.next();

                    //先生成一个正确的验证码
                    String rightCode = getCode();
                    System.out.println(rightCode);
                    if (rightCode.equalsIgnoreCase(code)) {
                        System.out.println("验证码正确");
                        break;
                    }
                    System.out.println("验证码错误");
                    //验证码输入错误，需要重新生成一个新的验证码，并且让用户重新输入
                    //不需要continue：因为这里已经是while(true)的最后一行，执行完自动进入下一轮
                }
                if (rightpasswd.equals(passwd)) {
                    System.out.println("登录成功");
                    //创建FightGame类的对象，并调用方法启动游戏
                    FightGame fg = new FightGame();
                    fg.gameStart(username);
                    break;
                }else{
                    System.out.println("登录失败，密码输入错误");
                    if(i == 2){
                        //三次机会用完了
                        u.setStatus(false);
                        System.out.println("当前账户"+username+"已锁定");
                        return;
                    }else{
                        //三次机会没有用完
                        System.out.println("密码错误，还剩下"+(2-i)+"次机会");
                    }
                }
            }

        }
    }

    //注册逻辑
    public static void register(ArrayList<User> list) {
        System.out.println("用户选择注册");
        //1.创建User对象（空参）
        User u = new User();
        //2.键盘录入用户名
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("请输入用户名");
                String username = sc.next();
                //校验用户名长度是否符合要求
                if (!checkLen(3, 16, username)) {
                    System.out.println("用户名长度不符合要求,必须是3-16位之间");
                    continue;
                }
                //只能由字母，数字构成，不能是纯数字
                if (!checkUsername(username)) {
                    System.out.println("用户名只能由字母，数字构成，不能是纯数字，也不能是纯字母");
                    continue;
                }
                //  用户名唯一
                if (contains(list, username)) {
                    System.out.println("用户名已经存在，请重新输入");
                    continue;
                }
                u.setUsername(username);
                break;
            }
        }
        //3.键盘录入密码
        while (true) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("请输入密码");
                String passwd1 = sc.next();
                System.out.println("请再次输入密码");
                String passwd2 = sc.next();
                //  校验密码长度是否符合要求
                if (!checkLen(3, 8, passwd1)) {
                    System.out.println("密码长度不符合要求,必须是3-8位之间");
                    continue;
                }
                //只能是字母数字组成，不能是纯数字
                if (!checkPasswd(passwd1)) {
                    System.out.println("密码必须要一个数字，一个字母，一个其他的字符");
                    continue;
                }
                //验证密码相同
                if (!passwd1.equals(passwd2)) {
                    System.out.println("两次密码不一致,请重新输入");
                    continue;
                }
                u.setPassword(passwd1);
                break;
            }
        }
        //4.把User对象添加到集合当中
        list.add(u);
        //5.提示成功
        System.out.println("用户：" + u.getUsername() + "注册成功");
    }

    //判断用户名在集合中是否包含
    public static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    //在集合当中去找username所在的索引
    public static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    // 用户名是否符合要求：只能由字母数字组成，不能是纯数字
    public static int[] getCount(String userInfo) {
        int charCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for (int i = 0; i < userInfo.length(); i++) {
            char c = userInfo.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                charCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            } else {
                otherCount++;
            }
        }
        return new int[]{charCount, numCount, otherCount};
    }

    // 用户名是否符合要求：只能由字母数字组成，不能是纯数字
    public static boolean checkUsername(String username) {
        int[] arr = getCount(username);
        // 0:字母的个数
        // 1.数字的个数
        //2.其他字符的个数
        return arr[0] > 0 && arr[1] >= 0 && arr[2] == 0;
    }

    // 密码是否符合要求：只能由字母数字组成，不能是纯数字，也不能是纯字母，需要一个特殊字符
    public static boolean checkPasswd(String passwd) {
        int[] arr = getCount(passwd);
        // 0:字母的个数
        // 1.数字的个数
        //2.其他字符的个数
        return arr[0] > 0 && arr[1] > 0 && arr[2] > 0;
    }

    //验证码写法
    public static String getCode() {
        //1.把所有的大写和小写的字母都放到一个容器
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        //2.从集合当中随机抽取字母（4次）
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt();
            char c = list.get(index);
            sb.append(c);
        }

        //3.生成一个一位的数字
        sb.append(r.nextInt(10));

        //4.数字的位置可以是任意的
        //先把sb变成字符串，调用toCharArray
        char[] arr = sb.toString().toCharArray();
        //把最大索引上的数据，跟一个的索引进行交换
        int i = r.nextInt(arr.length);
        //交换
        char temp = arr[i];
        arr[i] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        //把类型做交换
        return new String(arr);
    }

    // 判断字符串的长度是否在指定的范围之内
    public static boolean checkLen(int minLen, int MaxLen, String str) {
        return str.length() >= minLen && str.length() <= MaxLen;
    }

}
