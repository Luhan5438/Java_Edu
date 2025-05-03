package edu.luhan.mar25.demo.Demo160extendsConstructor;

/*
子类和父之间构造方法的特点
- 其实子类当中有默认加载super（）
- 子类只能在自己的构造方法中调用父的构造方法
- super语句必须是子类构造方法的第一个语句
 */

public class child extends parent{
    public child(){
        super(20);
        System.out.println("more");

    }
}
