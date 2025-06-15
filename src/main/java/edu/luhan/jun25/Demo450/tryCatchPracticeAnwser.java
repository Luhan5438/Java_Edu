package edu.luhan.jun25.Demo450;

import java.util.Scanner;

public class tryCatchPracticeAnwser {

    public static void main(String[] args) {
        // create the scanner
        // use the loop and break to control

        Scanner sc = new Scanner(System.in);
        int num = 0;
        String input="";
        while(true){
            try {
                input = sc.next();
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("please input a integer");;
            }
        }

        System.out.println("your input is" + input);
    }
}
