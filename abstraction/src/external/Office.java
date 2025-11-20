package external;

import internal.Building;

public class Office extends Building {
    public Office(){
        super();
    }
    public Office(String name){
        super(name);
    }
    public Office(String name,int floors){
        super(name,floors);
    }
}
