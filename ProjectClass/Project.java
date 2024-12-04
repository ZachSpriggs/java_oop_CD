import java.util.*;

public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project(){
        this.name = "";
        this.description = "";
        this.initialCost = 0.00;
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name; 
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name = name; 
        this.description = description;
        this.initialCost = initialCost;
    }

    public String elevatorPitch(){
        return this.name + "(" + this.initialCost + ")" + " : " + this.description;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    public double getInitialCost(){
        return initialCost;
    }


}