package com.常见API.Regex;

public class RegexTest1 {

    public static void main(String[] args) {
        //校验一个qq号码是否正确
        //要求：6-20位，0不能开头，全部为数字
        String qq = "1234567890";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        
    }

    //之前的写法
    /*public static boolean checkQQ(String qq) {
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }

        if (qq.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }*/

}
