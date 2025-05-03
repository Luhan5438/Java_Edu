package edu.luhan.feb25.demo;

//create a larger assemble of 20 numbers that generated randomly
//find out the even number and store them in a smaller assemble
//use a method to find out the even number

import java.util.ArrayList;
import java.util.Random;

public class Demo132ArrayAssemble {
    public static void main(String[] args) {

        //create the larger assemble
        //create the object for random generation
        ArrayList<Integer> listRandom = new ArrayList<>();
        Random number = new Random();

        for (int i = 0; i < 20; i++) {
            listRandom.add(number.nextInt());
        }

        System.out.println(evenFinder(listRandom));

    }

    //define if we have return - yes and return as arraylist
    //method name as evenFinder
    //parameter as larger arraylist

    public static ArrayList<Integer> evenFinder(ArrayList<Integer> list){

        //create the empty one for even number
        ArrayList<Integer> listEven = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            int result = list.get(i)%2;
            if (result == 0){
                listEven.add(list.get(i));
            }else{
                System.out.println("not a even number so we escape");
            }
        }

        return listEven;
    }


}
