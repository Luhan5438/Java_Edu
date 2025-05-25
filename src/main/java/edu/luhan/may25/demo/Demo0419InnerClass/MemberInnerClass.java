package edu.luhan.may25.demo.Demo0419InnerClass;

public class MemberInnerClass {

    public static void main(String[] args) {
        MemberInnerClass m = new MemberInnerClass();
        Outer o = m.new Outer();
        o.method1();

        //如何在其他地方中调用inner
        //method1
        Outer.inner inner = o.new inner();
        inner.sayHi();

        //method2
        //create a method to return inner class
        Outer.inner inner1 = o.returnInner();
    }

    class Outer{

        private int n1 = 100;
        public String name = "lulu";

        public class inner{
            public void sayHi(){
                System.out.println("say hi to " + name +" for age " + n1);
            }
        }

        public void method1(){
            inner i = new inner();
            i.sayHi();
        }

        public inner returnInner(){
            return new inner();
        }
    }
}
