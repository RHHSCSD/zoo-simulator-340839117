/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author menot
 */
public class WaterAnim extends Animal implements ISwimmable{
    private boolean canBreathe;
    private static final String WATER_SOUND = "Blub Blub";
    
    @Override
    public boolean canSurface() {
        return canBreathe;
    }
    public WaterAnim(String name, String species, char sex, int speed, int age, Image image, int height, boolean canBreathe) {
        super(name, species, sex, speed, age, image, WATER_SOUND);
        this.height = height;
        this.canBreathe = canBreathe;
    }
    public WaterAnim(String name, String species, char sex, Image image,int xPos, int yPos, int height, boolean canBreathe) {
        super(name, species, sex, image, WATER_SOUND, xPos, yPos);
        this.height = height;
        this.canBreathe = canBreathe;
    }
}
