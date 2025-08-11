package edu.luhan.aug25.demo473;

public class StringUsage {

    public static void main(String[] args) {

        String s1 = "jack and rose";
        String s2 = "snow white and queen";

        boolean a = s1.equals(s2);
        System.out.println(a);

        s1 = s1.replace("jack","john");
        System.out.println(s1);

    }
}
