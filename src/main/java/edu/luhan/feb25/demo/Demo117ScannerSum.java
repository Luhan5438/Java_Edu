package edu.luhan.feb25.demo;

//输入两个数字然后求和

import java.util.Scanner;

public class Demo117ScannerSum {

    public static void main(String[] args) {

        //call native class Scanner, and then build a new instance
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println("sum is " + sum);
    }
}
