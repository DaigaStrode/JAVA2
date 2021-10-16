package lv.daiga.rocketscience;

import java.util.Scanner;

public class LaunchPad {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();

        System.out.println("There are this many rockets: " + Rocket.countRockets());

        System.out.println("Name of the rocket1 is: " + rocket1.getName());
        System.out.println("Weight of the rocket1 is: " + rocket1.getWeight());

        //example how not to do, it is not a copy, but a reference to the same place in memory
        Rocket rocket2 = rocket1;
        rocket1.setName("Starship");
        System.out.println("Name of the rocket1 is: " + rocket1.getName());
        System.out.println("Name of the rocket2 is: " + rocket2.getName());

        //call the public attributes
        System.out.println(rocket1.id);

        renameRocket(rocket1, "MoonRover");
        System.out.println("Name of the rocket1 is: " + rocket1.getName());
        System.out.println("Name of the rocket2 is: " + rocket2.getName());

        System.out.println("There are this many rockets: " + rocket1.countRockets());

        changeWeight(rocket1.getWeight(), 1000);
        System.out.println("The weight of the rocket stayed the same outside the method " + rocket1.getWeight());

        //do like this instead
        rocket1.setWeight(1000);
        System.out.println("The weight of the rocket stayed the same outside the method " + rocket1.getWeight());

        Rocket rocket3 = new Rocket("Enterprise", "red", 100, 200, new Engine());
        rocket3.printRocketData();

        rocket3 = null;

        Scanner scanner = new Scanner(System.in);
        System.gc();
        System.out.println("Waiting for rocket to be destroyed");

        Math.pow(2,2);


    }

    /**
     * Renames the rocket by reference
     * Changes the original object
     * @param rocket
     * @param newName
     */
    private static void renameRocket(Rocket rocket, String newName){
        rocket.setName(newName);
    }

    /**
     * Changes the weight only locally
     * DON'T DO LIKE THIS
     * @param weight
     * @param newWeight
     */
    private static void changeWeight(int weight, int newWeight){
        weight = newWeight;
        System.out.println("Weight was changed locally to: " + weight);
    }

}
