package edu.luhan.feb25.demo;

public class Demo113Main {
    public static void main(String[] args) {
        Demo113StandardClass student = new Demo113StandardClass();

        //pass parameter
        student.setName("LUHAN");
        student.setAge(33);

        //take parameter
        System.out.println("name is" + student.getName()+"age is " + student.getAge());


        //setup again
        Demo113StandardClass student2 = new Demo113StandardClass("Mark",33);
        System.out.println("name is" + student2.getName()+"age is " + student2.getAge());




    }
}
