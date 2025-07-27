package edu.luhan.jul25.Demo456;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        EcmDef a = new EcmDef();


        System.out.println(a.cal(num1,num2));

    }

    public static class EcmDef{


         public int cal(int n1,int n2) throws ArithmeticException{
             int result=0;
            try {
                result = n1 / n2;

            }catch (Exception e) {
                System.out.println("exception found");
            };

             return result;
         }

    }
}
