/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * The LandAnim class represents a land animal, extending the Animal class.
 *
 * @author Jaden Wickens
 */
public class LandAnim extends Animal {

    /**
     * Constructs a LandAnim object with specified parameters. This case of the
     * constructor is intended to be used when a new animal is brought to the
     * zoo
     *
     * @param name the name of the land animal
     * @param species the species of the land animal
     * @param sex the sex of the land animal
     * @param speed the speed of the land animal
     * @param age the age of the land animal
     * @param image the image representing the land animal
     * @param sound the sound the land animal makes
     */
    public LandAnim(String name, String species, char sex, int speed, int age, Image image, String sound) {
        // call the apropriate constructor in the parent class Animal
        super(name, species, sex, speed, age, image, sound);
    }

    /**
     * Constructs a LandAnim object with specified parameters. This case of the
     * constructor is intended to be used when a new baby is born within the zoo
     *
     * @param name the name of the land animal
     * @param species the species of the land animal
     * @param sex the sex of the land animal
     * @param image the image representing the land animal
     * @param xPos the x-coordinate position of the land animal
     * @param yPos the y-coordinate position of the land animal
     * @param sound the sound the land animal makes
     */
    public LandAnim(String name, String species, char sex, Image image, int xPos, int yPos, String sound) {
        // call the apropriate constructor in the parent class Animal
        super(name, species, sex, image, sound, xPos, yPos);
    }
}
