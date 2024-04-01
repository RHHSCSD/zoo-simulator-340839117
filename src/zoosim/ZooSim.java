/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

import java.util.*;

/**
 * THINKING QUESTIONS:
 *
 * Sub-classes of the waterAnim, landAnim, and birdAnim could be created in
 * which each animal is classed in the predator or prey category. Since you
 * would have many prey and many predator classes, an interface for predator and
 * one for prey could be created and all the appropriate subclasses could
 * implement it. The predator class could include methods such as hunt() which
 * could cause the predator to search for and attack a prey animal. Prey could
 * have a counter method such as evade() where they hide from the predator.
 * Perhaps each predator could have an aggression field to control how often it
 * attacks prey. Similarly, prey could have an awareness variable that if high
 * enough allows them to evade capture from the predator. To implement diet
 * types, a simple field within the animal class could specify the animal’s diet
 * (Carnivore, Omnivore or Herbivore). Then, types of food (meat, veggie, grain,
 * etc.) could be implemented and the animal would require different food based
 * on diet. If a predator-type animal kills a prey-type animal (or any animal
 * kills any animal) the animal could be replaced with a meat-type food so that
 * the predator can then consume the prey.
 *
 * @author Jaden Wickens
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an empty string of Animals
        Animal[] zooAnims = new Animal[10];
        String[] names = new String[]{"Scooby", "Shaggy", "Daphne", "Velma", "Fred", "Splinter", "Donatello", "Michelangelo", "Raphael", "Leonardo"};

        char sex;
        boolean randBool;
        int speed;
        int age;
        Image image;
        String species;
        double rand;
        //Create a forloop that iterates through each index of the empty string of animals (zooAnims) to fill it
        //I didn't use the enhanced for loop sothat the variable i would be usable to fill in names of animals at athe same index in the names array.
        for (int i = 0; i < zooAnims.length; i++) {
            // randomly assign a sex to the animal
            if (Math.random() < 0.5) {
                sex = 'M';
            } else {
                sex = 'F';
            }
            //assign random age and speed
            speed = (int) (Math.random() * 10) + 1;
            age = (int) (Math.random() * 51);
            //create new instance of image to be used
            image = new Image(5, 5);
            //create a random boolean to be used for canFly and canBreathe variables
            randBool = Math.random() < 0.5;

            //Randomize a type of animal and fill the current index of zooAnim with that kind of animal and the peramiters set previously
            rand = Math.random();
            if (rand < 0.3) {
                zooAnims[i] = new WaterAnim(names[i], "Fish", sex, speed, age, image, -5, randBool);
            } else if (rand < 0.6) {
                zooAnims[i] = new BirdAnim(names[i], "Bird", sex, speed, age, image, randBool);
            } else {
                rand = Math.random();
                if (rand < 0.3) {
                    species = "lion";
                } else if (rand < 0.6) {
                    species = "Giraffe";
                } else {
                    species = "Monkey";
                }
                zooAnims[i] = new LandAnim(names[i], species, sex, speed, age, image, "ROAR");
            }
        }
    }

    /**
     * Adds a water animal to the zoo.
     *
     * @param zooAnims the array of animals in the zoo
     * @param name the name of the water animal
     * @param sex the sex of the water animal
     * @param speed the speed of the water animal
     * @param age the age of the water animal
     * @param image the image representing the water animal
     * @param height the height of the water animal
     * @param canBreathe indicates whether the water animal can breathe
     * underwater
     * @return the updated array of animals in the zoo
     */
    public static Animal[] addAnimal(Animal[] zooAnims, String name, char sex, int speed, int age, Image image, int height, boolean canBreathe) {
        //Create new array that includes all previous animals but also has one extra empty spot
        zooAnims = Arrays.copyOf(zooAnims, zooAnims.length + 1);
        // Fill the empty spot with the new water animal based on parameters
        zooAnims[zooAnims.length - 1] = new WaterAnim(name, "Fish", sex, speed, age, image, height, canBreathe);
        return zooAnims;
    }

    /**
     * Adds a bird to the zoo.
     *
     * @param zooAnims the array of animals in the zoo
     * @param name the name of the bird
     * @param sex the sex of the bird
     * @param speed the speed of the bird
     * @param age the age of the bird
     * @param image the image representing the bird
     * @param canFly indicates whether the bird can fly
     * @return the updated array of animals in the zoo
     */
    public static Animal[] addAnimal(Animal[] zooAnims, String name, char sex, int speed, int age, Image image, boolean canFly) {
        //Create new array that includes all previous animals but also has one extra empty spot
        zooAnims = Arrays.copyOf(zooAnims, zooAnims.length + 1);
        // Fill the empty spot with the new water animal based on parameters
        zooAnims[zooAnims.length - 1] = new BirdAnim(name, "Bird", sex, speed, age, image, canFly);
        return zooAnims;
    }

    /**
     * Adds a land animal to the zoo.
     *
     * @param zooAnims the array of animals in the zoo
     * @param name the name of the land animal
     * @param species the species of the land animal
     * @param sex the sex of the land animal
     * @param speed the speed of the land animal
     * @param age the age of the land animal
     * @param image the image representing the land animal
     * @return the updated array of animals in the zoo
     */
    public static Animal[] addAnimal(Animal[] zooAnims, String name, String species, char sex, int speed, int age, Image image) {
        //Create new array that includes all previous animals but also has one extra empty spot
        zooAnims = Arrays.copyOf(zooAnims, zooAnims.length + 1);
        // Fill the empty spot with the new water animal based on parameters
        zooAnims[zooAnims.length - 1] = new LandAnim(name, species, sex, speed, age, image, "ROAR");
        return zooAnims;
    }

    /**
     * Simulates animals eating based on their hunger levels.
     *
     * @param zooAnims the array of animals in the zoo
     */
    public static void eat(Animal[] zooAnims) {
        // enhanced for loop that iterates through every animal in the array of animals
        for (Animal x : zooAnims) {
            //if the animal is hungry, feed it
            if (x.getHunger() > 50) {
                x.eat();
            }
        }
    }

    /**
     * Simulates animals sleeping based on their fatigue levels.
     *
     * @param zooAnims the array of animals in the zoo
     */
    public static void sleep(Animal[] zooAnims) {
        // enhanced for loop that iterates through every animal in the array of animals
        for (Animal x : zooAnims) {
            //if the animal is tired, make it sleep
            if (x.getFatigue() > 50) {
                x.sleep();
            }
        }
    }

    /**
     * Moves all animals in the zoo.
     *
     * @param zooAnims the array of animals in the zoo
     */
    public static void moveAll(Animal[] zooAnims) {
        // enhanced for loop that iterates through every animal in the array of animals and makes them move
        for (Animal x : zooAnims) {
            x.move();
        }
    }

    /**
     * Retrieves statistics about the animals in the zoo.
     *
     * @param zooAnims the array of animals in the zoo
     * @return statistics about the animals in the zoo
     */
    public static String getStats(Animal[] zooAnims) {
        int total = zooAnims.length;
        int landAnimal = 0;
        int fish = 0;
        int bird = 0;
        double male = 0;
        double female = 0;
        int speedAvg = 0;
        int ageAvg = 0;
        String species;

        // enhanced for loop that iterates through every animal in the array of animals
        for (Animal x : zooAnims) {
            species = x.getSpecies();
            //if the animal at that index is a certain type, add one to that counter
            if (species.equals("Fish")) {
                fish++;
            } else if (species.equals("Bird")) {
                bird++;
            } else {
                landAnimal++;
            }
            //if the animal is female, add one to the female counter, otherwise add one to the male counter
            if (x.getSex() == 'F') {
                female++;
            } else {
                male++;
            }
            //add up all speeds of the animals
            speedAvg += x.getSpeed();
            //add up all ages of the animals
            ageAvg += x.getAge();
        }
        //devide the total speed by the number of animals in order to calculate the average
        speedAvg = (int) (speedAvg / total);
        //devide the total age by the number of animals in order to calculate the average
        ageAvg = (int) (ageAvg / total);
        //Calculate the percentage of females and males within the zoo
        female = Math.round(((female / total) * 100.0) * 100.0) / 100.0;
        male = Math.round(((male / total) * 100.0) * 100.0) / 100.0;

        //Return a string of the stats
        return "There are " + total + " total animals in the Zoo\nThe average speed of all animals is " + speedAvg + "\nThe average age of all animals is " + ageAvg + "\nThe zoo is " + male + "% male and " + female + "% female\nThere are " + bird + " birds, " + fish + " fish, and " + landAnimal + " land animals";
    }
}
