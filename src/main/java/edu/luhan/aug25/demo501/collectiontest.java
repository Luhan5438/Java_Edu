package edu.luhan.aug25.demo501;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class collectiontest {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add(new Dog("jiwawa","2"));
        list.add(new Dog("chaiquan","5"));
        list.add(new Dog("znagao","6"));

        Iterator i = list.iterator();

        //use iterator to scan
        while(i.hasNext()){
            Object obj = i.next();
            System.out.println(obj);
        }


        //use for to scan

        for (Object o : list) {
            System.out.println("use for to iterate"+o);
        }
    }

    static class Dog{

        private String name;
        private String age;

        public Dog(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}
