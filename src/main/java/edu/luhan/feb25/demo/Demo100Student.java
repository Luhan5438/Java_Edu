package edu.luhan.feb25.demo;

//理解什么是类 什么是对象
//更像是 将现实事物用计算机语言表达
//class更像是 在将现实事物创造的时候 画的一张图纸 更加的概念和抽象
//一个class 具有属性 和 行为
//属性描述 是什么 更像是 描述外观
//行为描述 干什么 描述了能力和作用

//任务 创建一个学生class
//属性：姓名 年龄；行为：吃饭 睡觉 学习

public class Demo100Student {

    //不写在method里面的变量 会成为class里面的全局变量
    String name;
    int age;

    //注意class里面的方法 不需要static
    public void eat() {
        System.out.println("yum yum");
    }

    public void sleep() {
        System.out.println("zzzzzzz");
    }

    public void study(){
        System.out.println("read and write");
    }

}
