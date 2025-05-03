package edu.luhan.apr25.demo.Demo194USBexample;

public class Laptop {

    public void pcON(){
        System.out.println("pc on");
    }

    public void pcOff(){
        System.out.println("pc off");
    }

    public void useUSB(USB usb){
        usb.switchOFF();

        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.switchON();
    }
}
