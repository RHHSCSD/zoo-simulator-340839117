/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * The WaterAnim class represents a water-dwelling animal, extending the Animal
 * class and implementing the ISwimmable interface.
 *
 * @author Jaden Wickens
 */
public class WaterAnim extends Animal implements ISwimmable {

    private boolean canBreathe;
    private static final String WATER_SOUND = "Blub Blub";

    /**
     * Constructs a WaterAnim object with specified parameters. This case of the
     * constructor is intended to be used when a new animal is brought to the
     * zoo
     *
     * @param name the name of the water animal
     * @param species the species of the water animal
     * @param sex the sex of the water animal
     * @param speed the speed of the water animal
     * @param age the age of the water animal
     * @param image the image representing the water animal
     * @param height the height of the water animal
     * @param canBreathe indicates whether the water animal can surface to
     * breathe
     */
    public WaterAnim(String name, String species, char sex, int speed, int age, Image image, int height, boolean canBreathe) {
        //Call the relevant animal constructor and set the water animal specific variables.
        super(name, species, sex, speed, age, image, WATER_SOUND);
        this.height = height;
        this.canBreathe = canBreathe;
    }

    /**
     * Constructs a WaterAnim object with specified parameters. This case of the
     * constructor is intended to be used when a new baby is born within the zoo
     *
     * @param name the name of the water animal
     * @param species the species of the water animal
     * @param sex the sex of the water animal
     * @param image the image representing the water animal
     * @param xPos the x-coordinate position of the water animal
     * @param yPos the y-coordinate position of the water animal
     * @param height the height of the water animal
     * @param canBreathe indicates whether the water animal can surface to
     * breathe
     */
    public WaterAnim(String name, String species, char sex, Image image, int xPos, int yPos, int height, boolean canBreathe) {
        //Call the relevant animal constructor and set the water animal specific variables.
        super(name, species, sex, image, WATER_SOUND, xPos, yPos);
        this.height = height;
        this.canBreathe = canBreathe;
    }

    /**
     * Checks if the water animal can surface to breathe.
     *
     * @return true if the water animal can surface to breathe, false otherwise
     */
    @Override
    public boolean canSurface() {
        return canBreathe;
    }
}
