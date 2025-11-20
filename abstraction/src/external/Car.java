package external;

import com.xworkz.abstraction.abstrct.Vehicle;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("car started");
    }

    @Override
    public void stop() {
        System.out.println("car stopped");

    }

    @Override
    public void accelerate() {
        System.out.println("car is accelerating");


    }
}
