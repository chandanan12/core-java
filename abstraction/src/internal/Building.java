package internal;

public abstract class Building {
    String name;
    int floors;
    public Building(String name){
        this();
        this.name=name;
    }
    public Building(){
    }
    public Building(String name,int floors){
        this.name=name;
        this.floors=floors;
    }
}
