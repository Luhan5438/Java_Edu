package edu.luhan.feb25.demo;

/*猜数字的小游戏*/
/*给出一个随机数字在0-10 然后不断猜测 直到猜对为止*/


/*1.generate the number first*/
/*2.input the number
3. compare the number and return result if it is bigger or smaller
4. if the same, then jump out of the cycle
 */

import java.util.Random;
import java.util.Scanner;

public class Demo124GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random number = new Random();
        int result = number.nextInt(10)+1;


        for (int i = 0; i < 5 ; i++) {
            int input = sc.nextInt();
            if ( input != result) {
                if ( input > result){
                    System.out.println(input + " is greater than result");
                }else {
                    System.out.println(input + " is smaller than result");
                }
            }else {
                System.out.println("Your guess is correct!!!");
                break;
            }


        }

        System.out.println("The result is " + result);
    }
}
