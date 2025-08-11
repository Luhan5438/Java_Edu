package edu.luhan.aug25.demo477;

import java.util.Scanner;

public class StringBufferUsage {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String num = a.next();

        StringBuffer n = new StringBuffer(num);

        //find out the dot location
        int dot = n.lastIndexOf(".");

        System.out.println(dot);
        System.out.println(n.length()-dot);

        // loop those digit without doc
        for (int i = dot-3; i > 0; i-=3) {

                n = n.insert(i,",");
            System.out.println("new number" + n);
        }



    }
}
