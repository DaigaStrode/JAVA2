package lesson7;

import lv.daiga.rocketscience.Engine;

import java.util.ArrayList;

public class PeopleSpaceShip extends SpaceShip {
    private int numberOfPeople;
    private ArrayList<String> namesOfPeople = new ArrayList<>();

    @Override
    public String toString() {
        return "PeopleSpaceShip{" +
                "namesOfPeople=" + namesOfPeople +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                ", cargoSpace=" + cargoSpace +
                '}';
    }

    @Override
    public void addCargo(){
        super.addCargo();
        System.out.println("Overriden addCargo method inside child class");
    }

    public PeopleSpaceShip() {
    }

    public PeopleSpaceShip(int numberOfPeople, ArrayList<String> namesOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public PeopleSpaceShip(Engine engine, String name, int cargoSpace, int numberOfPeople, ArrayList<String> namesOfPeople) {
        super(engine, name, cargoSpace);
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public ArrayList<String> getNamesOfPeople() {
        return namesOfPeople;
    }

    public void setNamesOfPeople(ArrayList<String> namesOfPeople) {
        this.namesOfPeople = namesOfPeople;
    }
}
