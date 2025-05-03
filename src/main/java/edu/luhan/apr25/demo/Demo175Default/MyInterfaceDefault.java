package edu.luhan.apr25.demo.Demo175Default;

//default method can be rewrite or not, it is decided by the design

public interface MyInterfaceDefault {

    public abstract void method1();

    public default void method2() {
        System.out.println(" default method 123");
    }
}
