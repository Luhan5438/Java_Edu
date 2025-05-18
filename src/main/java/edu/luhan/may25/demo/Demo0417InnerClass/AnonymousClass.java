package edu.luhan.may25.demo.Demo0417InnerClass;


/*
a demo of how to use it
 */
public class AnonymousClass {

    public void main(String[] args) {
        outer01 o = new outer01();
        o.p1();
    }

    class Person{
        public void hi(){
            System.out.println("say hi");
        }
    }

    class outer01{
        public void p1(){
            Person p = new Person() {
                @Override
                public void hi() {
                    System.out.println("say hi to all");
                }
            };
            p.hi();
        }
    }
}
