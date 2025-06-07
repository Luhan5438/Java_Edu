package edu.luhan.jun25.Demo437;

//this kind of annotation means that something is old and not suggest to use
//but it will still can be used

public class deprecated {

    public static void main(String[] args) {

        A a = new A();
        a.sing();
    }

    @Deprecated
    public static class A {
        public void sing(){
            System.out.println("sing");
        }

    }
}
