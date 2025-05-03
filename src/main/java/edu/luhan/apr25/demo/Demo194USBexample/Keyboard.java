package edu.luhan.apr25.demo.Demo194USBexample;

public class Keyboard implements USB{
    @Override
    public void switchON() {
        System.out.println("keyborad on");
    }

    @Override
    public void switchOFF() {
        System.out.println("keyboard off");


    }
    public void type(){
    System.out.println("type");
    }

}
