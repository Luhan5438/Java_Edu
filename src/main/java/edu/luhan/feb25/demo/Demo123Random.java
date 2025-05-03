package edu.luhan.feb25.demo;

/*随机取1-n之间的数字 可以取道1 也可以取到n*/
/*n可以是输入的数字*/

import java.util.Random;
import java.util.Scanner;

public class Demo123Random {
    public static void main(String[] args) {

        //interact with user for input
        Scanner sc = new Scanner(System.in);
        //return the result to n
        int n = sc.nextInt();

        Random number = new Random();

        //given bound is always be [0,n), so we +1, then we can take it as [1,n+1)
        for (int i = 0; i < 10; i++) {
            int result = number.nextInt(n)+1;
            System.out.println(result);
        }


    }
}
