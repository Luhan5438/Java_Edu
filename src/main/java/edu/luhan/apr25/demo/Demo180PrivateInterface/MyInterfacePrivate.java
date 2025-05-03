package edu.luhan.apr25.demo.Demo180PrivateInterface;

public interface MyInterfacePrivate {

    public static void method1(){
        System.out.println("method1");
        common();

    }

    public static void method2(){
        System.out.println("method2");
        common();
    }

    private static void common(){
        System.out.println("common");
    }

}
