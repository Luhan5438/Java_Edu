package edu.luhan.feb25.demo;

/*
构造string的方法主要有三种

public string() - = "abc"
char[] - use single character, then combine into one string
byte[] - use byte for ASCII code and represent the character

== use for comparison of address of the string, not accurate for content
we can use equal to compare
public boolean equals(Object obj)
public boolean equalsIgnoreCase（String str）

 */

public class Demo136StringEqual {
    public static void main(String[] args) {
        //create string
        String str1 = "abc";
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);

        //compare them
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        //if we want to use abc.equal then works ok
        //but we should not write as str4.equal("abc")
        //if str4 = null, we have nullpointer error

        String str4 = null;
        System.out.println("abc".equals(str4));
        System.out.println(str4.equals("abc"));//this is wrong


    }
}
