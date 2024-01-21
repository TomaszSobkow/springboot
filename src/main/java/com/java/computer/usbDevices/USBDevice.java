package com.java.computer.usbDevices;

public interface USBDevice {

    boolean connect();
    boolean disconnect();
    String getUsbDeviceName();
}
