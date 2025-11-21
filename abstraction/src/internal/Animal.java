package internal;

public abstract class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void walk(){
        System.out.println("Animal is walking");
    }
    public static void sound(){
        System.out.println("Animal will do sound");
    }
}
