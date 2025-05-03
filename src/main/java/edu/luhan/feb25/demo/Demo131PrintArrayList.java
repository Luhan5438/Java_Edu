package edu.luhan.feb25.demo;

//print the output in the format as
//{10@20@30}
//use string here as well

import java.util.ArrayList;

public class Demo131PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<>();
        newList.add("horse");
        newList.add("sheep");
        newList.add("cow");
        newList.add("rabbit");

        printFormat(newList);
    }

    //define a new method for printing the array list in the dedicate format
    //it is no return - void
    //method name as printformat
    //parameter as arraylist

    public static void printFormat(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            //tell if it is the last element
            if ( i == list.size()-1) {
                System.out.print(list.get(i));
            }else
            {
                System.out.print(list.get(i) + "@");
            }
        }
        System.out.print("}");
    }
}
