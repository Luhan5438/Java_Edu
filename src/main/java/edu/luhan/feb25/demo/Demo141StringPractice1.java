package edu.luhan.feb25.demo;
/*
定一个方法 将数组（1，2，3）按照指定格式拼接成一个字符串【word1#word2#word3】
 */

import java.util.Scanner;

public class Demo141StringPractice1 {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        String formatString=arraytoString(num);
        System.out.println(formatString);

    }
    
    //it has return as String
    //method as arraytoString
    //parameter as int array
    
    public static String arraytoString(int[] num){
        String str="[";

        for (int i = 0; i < num.length; i++) {
            str += "word" + num[i]+"#";
        }

        str +="]";

        return str;
    }
}
