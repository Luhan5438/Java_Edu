package edu.luhan.apr25.demo.Demo190PolyUpandDown;

public class PolyUpandDown {

    public static void main(String[] args) {
        //up
        Animal animal = new Cat();
        animal.eat();

        //down to cat
        Cat cat = (Cat) animal;
        cat.climb();


        // can not create a Dog at this moment,below is wrong
        //because now it has down to cat, you can not down to dog
        //Dog dog = (Dog) animal;

    }



}
