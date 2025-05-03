package edu.luhan.feb25.demo;

public class Demo109PrivatePerson {
    public static void main(String[] args) {

        Demo109PrivatePersonBuilder John = new Demo109PrivatePersonBuilder();

        //在main里面赋值
        John.name="John";
        John.setAge(50);
        John.setMale(true);

        //再打印出来 相当于输出
        System.out.println("we have a person called "+ John.name + " as age of "+John.getAge());
        System.out.println("The male is " + John.isMale());
    }

}
