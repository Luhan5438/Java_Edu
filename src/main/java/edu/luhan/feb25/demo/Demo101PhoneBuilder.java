package edu.luhan.feb25.demo;

//创建一个手机类
//属性：品牌， 颜色， 大小等
//行为：打电话 发短信 听音乐

public class Demo101PhoneBuilder {
    String brand;
    String color;
    int size;

    double price;

    //这里传入了一个变量who
    public void call(String who) {
        System.out.println("Ring ring "+who);
    };

    public void messaging (){
        System.out.println("Ding ding");
    };

    public void playmusic(){
        System.out.println("lalalala");
    };
}
