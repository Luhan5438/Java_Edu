package edu.luhan.feb25.demo;

public class Demo144Static {
    public static void main(String[] args) {
        Demo144StaticPerson one = new Demo144StaticPerson("cat",100);
        Demo144StaticPerson two = new Demo144StaticPerson("dog",99);
        one.room = "room 702";

        System.out.println(one.getName()+ one.getAge() + one.room+ one.getId());
        System.out.println(two.getName()+ two.getAge() + two.room+ two.getId());

    }
}
