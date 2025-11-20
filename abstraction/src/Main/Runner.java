package Main;

import com.xworkz.abstraction.abstrct.Vehicle;
import external.Car;
import external.Dog;
import external.Office;
import internal.Animal;
import internal.Building;


public class Runner {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.start();
        v.accelerate();
        v.stop();

        Animal a=new Dog();
        a.eat();
        a.sleep();
        Animal.sound();
        Animal.walk();

        Building b=new Office();
      b=new Office("tech Park",10);
      b=new Office("gold");
    }
}
