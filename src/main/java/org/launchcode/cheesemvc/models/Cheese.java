package org.launchcode.cheesemvc.models;

public class Cheese {
    private String name;
    private String description;
    private Integer id;
    public Cheese(String name, String description, Integer id){
        this.name = name;
        this.description = description;
        this.id = id;
    }
    public Cheese (String name, Integer id){
        this(name, "", id);
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
    public int getId(){
        return id;
    }
}
