package edu.luhan.aug25.demo505;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistprac {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("h");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");
        list.add("how");
        list.add("are");
        list.add("you");
        list.add("good");

        list.add(2,"exercise");
        System.out.println("current list" + list);
        System.out.println("5th element" + list.get(4));
        list.remove(5);
        System.out.println("current list" + list);
        list.set(6,"new");
        System.out.println("current list" + list);

        Iterator i = list.iterator();

        while (i.hasNext()){
            Object o = i.next();
            System.out.println("Iterator" + o);
        }








    }
}
