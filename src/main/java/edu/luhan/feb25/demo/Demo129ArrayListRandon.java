package edu.luhan.feb25.demo;

/*
要求生成6个1-33之间的随机整数，并且添加到集合
 */

import java.util.ArrayList;
import java.util.Random;

public class Demo129ArrayListRandon {
    public static void main(String[] args) {
        //create the obejct can generate random number
        Random number = new Random();

        //create the arraylist to contain them
        ArrayList<Integer> listNum = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            listNum.add(number.nextInt(33)+1);
            //System.out.println(listNum);
        }

        for (int i = 0; i < listNum.size(); i++) {
            System.out.println(listNum.get(i));
        }

        }

    }

