package edu.luhan.jun25.Demo450;

//如果用户输入的不是一个整数 就提示他反复输入 直到输入为一个整数为止

import java.util.Scanner;

public class tryCatchPractice {

    public void inputNum() {

    try
        {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

        } catch(Exception e) {
          System.out.println("We have to input a integer");
          inputNum();
        }
    }

    public static void main(String[] args) {
        tryCatchPractice t = new tryCatchPractice();
        t.inputNum();

    }

}

