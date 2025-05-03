package edu.luhan.feb25.demo;

//理解什么是构造方法 从builder往实例化的过程 相当于创建了一个对象
//之前所有的new 都是一种默认的构造方法 相当于
//public Demo112ConstrStu （）{}
//构造方法可以重载


public class Demo112ConstrStu {

    //设置参数
    private String name;
    private int age;

    //Constructor

    public Demo112ConstrStu(){
        System.out.println("no param constructor");
    }

    public Demo112ConstrStu(String name,int age){
        this.name=name;
        this.age=age;

        System.out.println("check" + this.name + this.age);
    }

    //name的getter setter
    public void setName(String name) {
        this.name = name;
        if ( this.name.length() > 3){
            System.out.println("name too long");
        } else{
            System.out.println("name length ok");
        }
    }

    public String getName() {
        return name;
    }

    //age的getter setter

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
