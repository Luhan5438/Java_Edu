package edu.luhan.feb25.demo;

//do not need to give it a name if we just use it for once
//the usage of this is
// simplified the code
// release the memory


import java.util.Scanner;

public class Demo120Anonymous {

    public static void main(String[] args) {

    Scanner scc = methodReturn();
    int num = scc.nextInt();
    System.out.println(num);

    }


    //normal way
    public static void methodParam(Scanner sc) {
        int a = sc.nextInt();
        System.out.println("we have a number " + a);

    }

    // note that the return type is Scanner

    // we do not need to create a new object but just return what is type in
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
