package edu.luhan.feb25.demo;

import java.util.Scanner;

public class Demo118ScannerMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrayA = new int[4];
        arrayA[0] = sc.nextInt();
        arrayA[1] = sc.nextInt();
        arrayA[2] = sc.nextInt();
        arrayA[3] = sc.nextInt();

        int max = arrayA[0];
        for (int i = 0; i < arrayA.length; i++) {

           if ( arrayA[i] > max ) {
               max = arrayA[i];
           }

        }
        System.out.println("now the max is " +max);




    }
}
