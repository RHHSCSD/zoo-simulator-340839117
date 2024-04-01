/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * The BirdAnim class represents a bird, extending the Animal class and
 * implementing the IFlyable interface.
 *
 * @author Jaden Wickens
 */
public class BirdAnim extends Animal implements IFlyable {

    private boolean canFly;
    private static final String BIRD_SOUND = "Tweet Tweet";
    private int height = 0;

    /**
     * Constructs a BirdAnim object with specified parameters. This case of the
     * constructor is intended to be used when a new animal is brought to the
     * zoo
     *
     * @param name the name of the bird
     * @param species the species of the bird
     * @param sex the sex of the bird
     * @param speed the speed of the bird
     * @param age the age of the bird
     * @param image the image representing the bird
     * @param canFly indicates whether the bird can fly
     */
    public BirdAnim(String name, String species, char sex, int speed, int age, Image image, boolean canFly) {
        super(name, species, sex, speed, age, image, BIRD_SOUND);
        this.canFly = canFly;
    }

    /**
     * Constructs a BirdAnim object with specified parameters. This case of the
     * constructor is intended to be used when a new baby is born within the zoo
     *
     * @param name the name of the bird
     * @param species the species of the bird
     * @param sex the sex of the bird
     * @param image the image representing the bird
     * @param xPos the x-coordinate position of the bird
     * @param yPos the y-coordinate position of the bird
     * @param canFly indicates whether the bird can fly
     */
    public BirdAnim(String name, String species, char sex, Image image, int xPos, int yPos, boolean canFly) {
        super(name, species, sex, image, BIRD_SOUND, xPos, yPos);
        this.canFly = canFly;
    }

    /**
     * Makes the bird fly.
     */
    @Override
    public void fly() {
        // if the bird can fly, increase its height, if not display message without increasing height
        if (canFly) {
            height++;
        } else {
            System.out.println(name + " jumped but is still on the ground becase they cannot fly");
        }
    }

    /**
     * Lands the bird.
     */
    @Override
    public void land() {
        // bring bird height back to the ground
        height = 0;
    }

    /**
     * Checks if the bird is currently flying.
     *
     * @return true if the bird is flying, false otherwise
     */
    @Override
    public boolean isFlying() {
        // If the bird is above the ground: return true, else return false
        if (height > 0) {
            System.out.println(name + " is currently flying at a hight of " + height);
            return true;
        } else {
            System.out.println(name + " is not currently flying");
            return false;
        }

    }

}
