package com.常见API.String.demo7;

public class Test5 {

    public static void main(String[] args) {
        String str1 = "12395";
        String str2 = "133";

        // 把两个字符串的数据放入到int类型的数据里面
        int len = str1.length() >= str2.length() ? str1.length() : str2.length();
        int[] arr1 = copyData(str1, len);
        int[] arr2 = copyData(str2, len);

        // 定义一个数组存入最终的结果，数组的长度+1
        int[] sum = new int[len + 1];

        // 定义一个变量表示：进位
        int num = 0;

        // 遍历数组，从个位（最大索引）位置开始计算
        for (int i = len - 1; i >= 0; i--) {
            // arr1[i] + arr[2] + 进位 = 结果
            int temp = arr1[i] + arr2[i] + num;
            //结果的个位 --- sum数组当中
            sum[i + 1] = temp % 10;
            // 结果的十位 --- 进位sum
            num = temp / 10;
        }

        //考虑到最终结果的首位
        sum[0] = num;

        //把sum数组当中的数据拼接成一个字符串
        StringBuilder sb = new StringBuilder();
        if (sum[0] != 0) {
            sb.append(sum[0]);
        }
        for (int i = 1; i < sum.length; i++) {
            sb.append(sum[i]);
        }
        System.out.println(sb);
    }

    // 把字符串中的数据，放入到int类型的数据当中
    public static int[] copyData(String str, int len) {
        //定义int类型的数组
        int[] arr = new int[len];
        //定义一个变量表示数组中应存入的位置
        int index = arr.length - 1;
        //把字符串中的数据，放入到数组当中,倒着遍历
        //133
        //00133
        for (int i = str.length() - 1; i >= 0; i++) {
            char c = str.charAt(i);
            arr[index] = c - 48;
            index--;
        }
        return arr;
    }

}
