package Models;

import java.util.ArrayList;

public class Squad {

    // class fields
    private String name;
    private int size;
    private String cause;
    private int id;

    private static ArrayList<Squad> instances = new ArrayList<Squad>();

    // constructor
    public Squad(String name, int size, String cause){
        this.name = name;
        this.size = size;
        this.cause = cause;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName(){
        return name;
    }
    public int getSize(){
        return size;
    }
    public String getCause(){
        return cause;
    }
    public int getId(){
        return id;
    }



}
