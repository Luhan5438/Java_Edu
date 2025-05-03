package edu.luhan.apr25.demo.Demo194USBexample;

public class Mouse implements USB{

    @Override
    public void switchON() {
        System.out.println("mouse on");
    }

    @Override
    public void switchOFF() {
        System.out.println("mouse off");
    }

    public void click(){
        System.out.println("click");
    }

}
