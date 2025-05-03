package edu.luhan.feb25.demo;

//理解实例化作为返回值
//感觉有点像api

public class Demo106PhoneReturn {
    public static void main(String[] args) {
        Demo101PhoneBuilder yourPhone = getPhone();
        System.out.println(yourPhone.price);
        System.out.println(yourPhone.color);
        yourPhone.messaging();

    }

    //这里的实例化 更像是赋值参数
    public static Demo101PhoneBuilder getPhone () {
        Demo101PhoneBuilder myPhone = new Demo101PhoneBuilder();
        myPhone.price=7888;
        myPhone.color="yellow";
        return myPhone;
    }
}
