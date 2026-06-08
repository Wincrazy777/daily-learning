package com.常见API.ArrayList.apiarrlistapidemo2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(num + "]");
            } else {
                System.out.print(num + " ");
            }
        }
    }

}
