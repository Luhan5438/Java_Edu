package edu.luhan.apr25.demo.Demo177Static;

public class DemoMyInterfaceStatic {
    public static void main(String[] args) {
        MyInterfaceStatic.method1(5);

        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        impl.method2();
    }
}
