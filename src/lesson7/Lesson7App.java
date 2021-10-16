package lesson7;

import lv.daiga.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);



        PeopleSpaceShip peopleSpaceShip = new PeopleSpaceShip(new Engine(), "Elon", 100, 3, new ArrayList<String>());

        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Brenson");

        System.out.println(peopleSpaceShip);

        peopleSpaceShip.addCargo();
        peopleSpaceShip.addCargo(200);

        //this is also on overloading
        System.out.println(100);
        System.out.println("String");
        System.out.println(peopleSpaceShip);

        //polimorphism allows to call methods upon a parent and all its children classes
        printInfoAboutSpaceShip(spaceShip);
        printInfoAboutSpaceShip(peopleSpaceShip);

        //virtual method example of polimorphic methods
        //uses original method from parent class
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();
        //uses overriden method in child class
        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();

        //upcasting example
        SpaceShip castedSpaceShip = (SpaceShip) peopleSpaceShip;
        //downcasting example
        PeopleSpaceShip castedPeopleSpaceShip = (PeopleSpaceShip) spaceShip;
//        //here will be an error, that called method doesnt have the method called
//        castedPeopleSpaceShip.getNamesOfPeople();
    }
    public static void printInfoAboutSpaceShip(SpaceShip spaceShip){
        System.out.println("I have a Space Ship: " + spaceShip);
    }
}
