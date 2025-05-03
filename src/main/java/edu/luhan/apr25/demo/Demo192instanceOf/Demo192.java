package edu.luhan.apr25.demo.Demo192instanceOf;

import edu.luhan.apr25.demo.Demo190PolyUpandDown.Dog;
import edu.luhan.apr25.demo.Demo190PolyUpandDown.Cat;
import edu.luhan.apr25.demo.Demo190PolyUpandDown.Animal;



public class Demo192 {

    public static void main(String[] args) {

        Animal animal = new Cat();

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchhouse();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.climb();
        }

    }
}
