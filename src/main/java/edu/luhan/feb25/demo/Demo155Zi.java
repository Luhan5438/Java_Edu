package edu.luhan.feb25.demo;

public class Demo155Zi extends Demo155Fu {

    int num =30;

    public void method(){
        int num = 20;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
