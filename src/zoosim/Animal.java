/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

import java.util.*;

/**
 * The Animal class represents an animal entity.
 *
 * @author Jaden Wickens
 */
public class Animal implements IEntity {

    private static int idSave = 0;
    private int id;
    protected String name;
    private String species;
    private char sex;
    private int age;
    private int xPos = -100000;
    private int yPos = -100000;
    private int xWidth;
    private int yWidth;
    private int speed;
    private int maxSpeed = 10;
    private int minSpeed = 0;
    private int degrees = 0;
    private int hunger = 0;
    private int fatigue = 0;
    protected int height = 0;
    private Image image;
    private String sound;

    /**
     * Constructs an Animal object with specified parameters. This case of the
     * constructor is intended to be used when a new animal is brought to the
     * zoo
     *
     * @param name the name of the animal
     * @param species the species of the animal
     * @param sex the sex of the animal
     * @param speed the speed of the animal
     * @param age the age of the animal
     * @param image the image representing the animal
     * @param sound the sound the animal makes
     */
    public Animal(String name, String species, char sex, int speed, int age, Image image, String sound) {
        //Call the method thaat sets most of the variables for both contstructors.
        animalSetter(name, species, sex, image, sound);
        //set all variables specific to this constructor
        this.age = age;
        //chack that speed is a correct value, if not set it to 5
        if (speed < maxSpeed && speed > minSpeed) {
            this.speed = speed;
        } else {
            this.speed = 5;
        }
    }

    /**
     * Constructs an Animal object with specified parameters. This case of the
     * constructor is intended to be used when a new baby is born within the zoo
     *
     * @param name the name of the animal
     * @param species the species of the animal
     * @param sex the sex of the animal
     * @param image the image representing the animal
     * @param sound the sound the animal makes
     * @param xPos the x-coordinate position of the animal
     * @param yPos the y-coordinate position of the animal
     */
    public Animal(String name, String species, char sex, Image image, String sound, int xPos, int yPos) {
        //Call the method thaat sets most of the variables for both contstructors.
        animalSetter(name, species, sex, image, sound);
        //set all variables specific to this constructor
        this.age = 0;
        this.speed = 0;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * Sets the common attributes of the animal.
     *
     * @param name the name of the animal
     * @param species the species of the animal
     * @param sex the sex of the animal
     * @param image the image representing the animal
     * @param sound the sound the animal makes
     */
    public void animalSetter(String name, String species, char sex, Image image, String sound) {
        //Give each animal an ID, since idSave is static each animal is givin a different ID.
        idSave++;
        id = idSave;

        //Set all variables based on parameters
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.sound = sound;

        //Get the size of the animal from the siize of the image
        xWidth = image.getWidth();
        yWidth = image.getHeight();
    }

    /**
     * Moves the animal according to its speed and Direction.
     */
    @Override
    public void move() {
        //Transform degree units into radian units and then use trig to find x and y components of the movment to change the current position.
        double radians = Math.toRadians(degrees);
        yPos += speed * Math.sin(radians);
        xPos += speed * Math.cos(radians);
    }

    /**
     * Makes the sound of the animal.
     */
    @Override
    public void makeSound() {
        //print the animals sound to the console
        System.out.println(sound);
    }

    /**
     * Feeds the animal. Resets the hunger level of the animal.
     */
    @Override
    public void eat() {
        //reset hunger to zero and display new hunger in console
        hunger = 0;
        System.out.println("Animal is" + hunger + "% hungry");
    }

    /**
     * Causes the animal to sleep. Resets the fatigue level of the animal.
     */
    @Override
    public void sleep() {
        //reset fatigue to zero and display new fatigue level in console
        fatigue = 0;
        System.out.println("Animal is" + fatigue + "% tired");
    }

    /**
     * Rotates the animal by the specified degrees.
     *
     * @param degrees the degrees to rotate the animal
     */
    @Override
    public void turn(int degrees) {
        // add turn degree to current direction faced
        this.degrees += degrees;
    }

    /**
     * Places the animal at the specified position.
     *
     * @param x the x-coordinate position to place the animal
     * @param y the y-coordinate position to place the animal
     */
    @Override
    public void place(int x, int y) {
        //set X and Y positions to inputed peramiters
        xPos = x;
        yPos = y;
    }

    /**
     * Gets the hunger level of the animal.
     *
     * @return the hunger level of the animal
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Gets the fatigue level of the animal.
     *
     * @return the fatigue level of the animal
     */
    public int getFatigue() {
        return fatigue;
    }

    /**
     * Gets the species of the animal.
     *
     * @return the species of the animal
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Gets the sex of the animal.
     *
     * @return the sex of the animal
     */
    public char getSex() {
        return sex;
    }

    /**
     * Gets the speed of the animal.
     *
     * @return the speed of the animal
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the age of the animal.
     *
     * @return the age of the animal
     */
    public int getAge() {
        return age;
    }
}
