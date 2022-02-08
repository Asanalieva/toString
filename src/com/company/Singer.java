package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation,String bandName){
        super(name,designation);
        this.bandName = bandName;
    }
    public Singer(){

    }
    public void singing(){
        System.out.println("Singing");
    }
    public void playGuitar(){
        System.out.println("Playing guitar");
    }

    public String getBandName(){
        return bandName;
    }
    public void setBandName(String bandName){
        this.bandName = bandName;
    }
}
