package edu.luhan.feb25.demo;

/*
写一个function可以计算一个字符串里每个字符类型的个数
包含 数字 大写字母 小写字母 其他
该字符串是通过键盘输入


思路：
1. 创建scanner
2. 将字符串变为一个一个字符
3. 循环判断字符类型 计数
 */

import java.util.Scanner;

public class Demo142StringPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        //拆分为数组
        char[] charArray = input.toCharArray();

        //count as start
        int countUpper =0;
        int countLower = 0;
        int countNumber =0;
        int countOther = 0;


        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ( ch > 'A' & ch < 'Z') {
                countUpper++;
            }else if ( ch > 'a' & ch <'z'){
                countLower++;
            }else if ( ch > '0'  & ch < '9'){
                countNumber++;
            }else{
                countOther++;
            }
        }

        System.out.println("upper" + countUpper);
        System.out.println("lower" + countLower);
        System.out.println("number" + countNumber);
        System.out.println("other" +countOther);


    }
}
