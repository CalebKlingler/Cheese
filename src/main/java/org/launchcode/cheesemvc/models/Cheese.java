package org.launchcode.cheesemvc.models;

public class Cheese {
    private String name;
    private String description;

    public Cheese(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Cheese (String name){
        this(name, "");
    }

    public String getName(){
        return name;
    }
    private void setName(String aName){
        name = aName;
    }
    public String getDescription(){
        return description;
    }
    private void setDescription(String aDescription){
        description = aDescription;
    }
}
