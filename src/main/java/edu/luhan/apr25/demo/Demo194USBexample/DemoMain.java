package edu.luhan.apr25.demo.Demo194USBexample;

public class DemoMain {

    public static void main(String[] args) {
        Laptop computer = new Laptop();
        computer.pcOff();
        computer.pcON();


// want to use mouse
        USB usb = new Mouse();
        computer.useUSB(usb);


        //another method
        Keyboard keyboard = new Keyboard();
        computer.useUSB(keyboard);

    }
}
