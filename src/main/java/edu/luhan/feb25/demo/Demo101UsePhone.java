package edu.luhan.feb25.demo;


//创建一个调用手机的主要类

public class Demo101UsePhone {
    public static void main(String[] args) {
        Demo101PhoneBuilder myPhone = new Demo101PhoneBuilder();

        myPhone.size=10;
        myPhone.brand="iphone";
        myPhone.color="black";

        myPhone.call("Luhan");
        myPhone.messaging();
        myPhone.playmusic();
    }
}
