package com.java.computer;

import com.java.computer.file.musicFile.Mp3File;
import com.java.computer.usbDevices.HeadPhone;
import com.java.computer.usbDevices.Keyboard;
import com.java.computer.usbDevices.MemoryStick;
import com.java.computer.usbDevices.Mouse;

public class MainComputer {


    public static void main(String[] args) {
        MemoryStick memoryStick = new MemoryStick("New STICK 3 GB");


        Computer computer = new Computer();
        computer.addNewUsbDevice(new MemoryStick("Sandisk 128GB"));
        computer.addNewUsbDevice(memoryStick);
        computer.addNewUsbDevice(new HeadPhone("Bose"));
        computer.addNewUsbDevice(new Mouse("Dell"));
        computer.addNewUsbDevice(new Keyboard("Logitech"));
        computer.drive().addFile(new Mp3File("Music",1278,"2 Unlimited","Get Ready",320));

        System.out.println(computer);
        computer.removeUsbDevice(memoryStick);
        memoryStick.eject();
        computer.removeUsbDevice(memoryStick);

        //2:07:50
        // on YouTube course https://www.youtube.com/watch?v=OvY0f-IWlos

    }
}
