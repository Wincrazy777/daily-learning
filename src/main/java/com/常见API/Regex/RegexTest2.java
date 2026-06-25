package com.常见API.Regex;

public class RegexTest2 {

    public static void main(String[] args) {
        //public boolean matches(String regex):判断是否与正则表达式匹配，匹配则返回false

        //只能是abc
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("ab".matches("[abc][abc]"));
        System.out.println("-------------------------");

        //不能出现abc
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
        System.out.println("zz".matches("[^abc]"));
        System.out.println("zz".matches("[^abc][^abc]"));
        System.out.println("-------------------------");

        //[a-z&&[def]] 交集
        System.out.println("d".matches("[a-z&&[def]]"));
        System.out.println("g".matches("[a-z&&[def]]"));
        System.out.println("-------------------------");

        //. 任意字符
        System.out.println("你".matches("."));
        System.out.println("-------------------------");

        //\d 数字
        System.out.println("5".matches("\\d"));
        System.out.println("a".matches("\\d"));
        System.out.println("-------------------------");

        //\w 单词字符
        System.out.println("a".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println(".".matches("\\w"));
        System.out.println("-------------------------");

        //X? 一次或0次
        System.out.println("".matches("a?"));
        System.out.println("a".matches("a?"));
        System.out.println("aa".matches("a?"));
        System.out.println("-------------------------");

        //X* 0次或多次
        System.out.println("".matches("a*"));
        System.out.println("a".matches("a*"));
        System.out.println("aaaa".matches("a*"));
        System.out.println("b".matches("a*"));
        System.out.println("-------------------------");

        //X+ 1次或多次
        System.out.println("".matches("a+"));
        System.out.println("a".matches("a+"));
        System.out.println("aaaaaaaa".matches("a+"));
        System.out.println("-------------------------");

        //手机号校验 1[3-9]后面9位数字
        System.out.println("13812345678".matches("1[3-9]\\d{9}"));
        System.out.println("12812345678".matches("1[3-9]\\d{9}"));
        System.out.println("-------------------------");

        //邮箱校验
        System.out.println("abc@qq.com".matches("\\w+@\\w+\\.\\w+"));
        System.out.println("abc@.com".matches("\\w+@\\w+\\.\\w+"));

        // \转义字符 改变后面那个字符原本的含义
        System.out.println("\"\"");

    }
    // .任何字符 \d 一个数字 \D 非数字 \s 一个空白字符 \S 非空白字符 \w 英文数字下划线 \W 一个非单词字符

}
