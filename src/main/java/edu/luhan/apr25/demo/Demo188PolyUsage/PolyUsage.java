package edu.luhan.apr25.demo.Demo188PolyUsage;

public class PolyUsage {

    public static void main(String[] args) {
        Fu test = new Zi();

        System.out.println(test.num);
        //it prints out the number from parent class

        test.showNum();
        //it gets the child number

        test.method();
        test.methodFu();
        //it can not reach to methodZi
    }
}
