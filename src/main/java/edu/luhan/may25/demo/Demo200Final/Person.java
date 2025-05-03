package edu.luhan.may25.demo.Demo200Final;

//final可以用来修饰一个方法 代表这个方法没有任何继承
//final还可以修饰一个变量 代表这个变量的地址不可以改变
//fina在这个类当中的写法如下 不可以有setter

public class Person {

    private final String name ;

    public Person() {
        name = "lulu";
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    //public void setName(String name) {
      //  this.name = name;
    //}
}
