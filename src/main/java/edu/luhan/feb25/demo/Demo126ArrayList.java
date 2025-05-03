package edu.luhan.feb25.demo;

/*
Arraylist 和Array最大的不同在于不需要定义长度
常用方法有增删改减
add，remove，size
写一个可以循环读取arraylist的方法
 */

import java.util.ArrayList;

public class Demo126ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //add the element
        list.add("lulu");
        list.add("mama");
        list.add("tuotuo");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+list.get(i));
        }

        System.out.println(list.size());

        //当我们循环remove的时候有问题
        //lulu被remove后 i变为1， 而数组变为 mama，tuotuo
        //则tuotuo成为index=1的值，被remove
        int length = list.size();
        for (int i = 0; i < length; i++) {
            String whoRemoved=list.remove(0);
            System.out.println("we remove "+ i+ whoRemoved);

        }

        System.out.println(list);
    }
}
