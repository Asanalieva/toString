package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Spiderman","Human");
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();
        person.line();

        Programmer programmer = new Programmer("Dilbara","Smartest back-end developer","Microsoft");
        System.out.println(programmer+" Иштеген жери: "+programmer.getCompanyName());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        programmer.line();

        Dancer dancer = new Dancer("Jimmy","Tango","Stranger's group");
        System.out.println(dancer +" " + dancer.getGroupName());
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.eat();
        dancer.dancing();
        dancer.line();

        Singer singer = new Singer("The Weekend","most listened singer in Spotify","Solo");
        System.out.println(singer + " " +"Группа: "+ singer.getBandName());
        singer.learn();
        singer.walk();
        singer.eat();
        singer.eat();
        singer.singing();
        singer.playGuitar();
        singer.line();
    }
}
