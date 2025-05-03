package edu.luhan.feb25.demo;

//通过名字 来证明this的使用
//一个和别人打招呼的程序

public class Demo111thisNameBuilder {

    //定义名字
    //我的名字
    String name;

    //输入参数为别人的名字
    //方法总是就近找参数
    //this 和 static不能一起调用- why -需要深入理解
    public void sayHi(String name){
        System.out.println("My name is " + this.name);
        System.out.println("say hi to " + name);

    }

}
