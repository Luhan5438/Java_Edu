package edu.luhan.feb25.demo;

/*
use split function and add the delimiter there
it is the regex for split function, eg if we use dot as delimiter, it will be split("\\.")
 */
public class Demo140StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
