package edu.luhan.may25.demo.Demo0417InnerClass;

/*
compare with normal way
 */
public class Anonymousclass01 {
    public static void main(String[] args) {

//匿名内部类可以可以用于直接传参数
// 适合于只用一次的场景
        method(new IL() {
            @Override
            public void show() {
                System.out.println("test");
            }
        });

        method(new method1());
    }

//create the interface
    interface IL{
        void show();
    }

    public static void method(IL il){
        il.show();
    }

//传统写法
    static class method1 implements IL{
    @Override
    public void show() {
        System.out.println("test");
    }


}


}
