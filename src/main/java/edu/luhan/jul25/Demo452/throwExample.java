package edu.luhan.jul25.Demo452;

import java.io.FileInputStream;

public class throwExample {

    public static void main(String[] args) throws Exception {
        Throw1();

    }

    public static void Throw1() throws Exception{

        FileInputStream fs = new FileInputStream("a.txt");

    }

    //the exception in son can not larger than father
    // throws and try-catch-finally we can just choose one
    //编译异常必须要处理 运行异常不一定 所以有一些需要写code的时候就处理

    public class father {
        public void method() throws RuntimeException{};
    }

    public class son extends father{
        @Override
        public void method() throws NullPointerException {
            System.out.println("father");
        }
    }

}
