package edu.luhan.feb25.demo;

//理解一个对象也可以作为参数
//实例化之后 可以传来传去
//将实例化的对象作为参数 包在新的方法里面 可以进行多一步操作
//层级为：main赋值 调用telephone --》telephone对具体的phone进行操作--》用phonebuilder实例化作为input --》


public class Demo105PhoneParam {
    public static void main(String[] args) {
        Demo101PhoneBuilder newPhone = new Demo101PhoneBuilder();
        newPhone.color="yellow";
        newPhone.price=8000;
        telephone(newPhone,"lll");
    }

    public static void telephone (Demo101PhoneBuilder Param,String who) {
        System.out.println("Enter here");
        System.out.println(Param.color);
        System.out.println(Param.price);
        Param.call(who);
        Param.playmusic();
    }
}
