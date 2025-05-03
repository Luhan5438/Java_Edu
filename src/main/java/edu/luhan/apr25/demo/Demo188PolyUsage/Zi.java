package edu.luhan.apr25.demo.Demo188PolyUsage;

public class Zi extends Fu{

     int num = 10;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
     public void method(){
         System.out.println("overwrite parent method");
     }

     public void methodZi(){
         System.out.println("zi only");
     }
}
