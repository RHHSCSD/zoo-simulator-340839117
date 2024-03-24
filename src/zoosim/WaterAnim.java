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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public WaterAnim(String name, String species, char sex, int speed, int age, Image image, int height) {
        super(name, species, sex, speed, age, image, WATER_SOUND);
        this.height = height;
    }
    public WaterAnim(String name, String species, char sex, Image image,int xPos, int yPos, int height) {
        super(name, species, sex, image, WATER_SOUND, xPos, yPos);
        this.height = height;
    }
}
