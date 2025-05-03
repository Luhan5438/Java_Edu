package edu.luhan.feb25.demo;

//定义一个标准类
//其中包含private的变量
//对应private变量就必须有getter setter
//创建constructor
//actually this will be java bean when we know spring

public class Demo113StandardClass {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo113StandardClass() {
    }

    public Demo113StandardClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
