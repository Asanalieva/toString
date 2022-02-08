package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public Person(){
    }
    public void learn(){
        System.out.println(name+" is Learning");
    }
    public void walk(){
        System.out.println(name+" is Walking");
    }
    public void eat(){
        System.out.println(name+" is Eating");
    }
    public void line(){
        System.out.println("-------------------------------");
    }

    @Override
    public String toString(){
        return "Aты: "+name + " Иши: "+ designation;
    }

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(){
        this.designation = designation;
    }

}
