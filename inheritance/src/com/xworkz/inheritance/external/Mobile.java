package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Device;

public class Mobile extends Device {
    String model = "Samsung Galaxy";

    public void showModel() {
        System.out.println("Mobile model: " + model);
    }
}
