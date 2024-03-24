/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author menot
 */
public class LandAnim extends Animal {
    public LandAnim(String name, String species, char sex, int speed, int age, Image image, String sound) {
        super(name, species, sex, speed, age, image, sound);
    }
    public LandAnim(String name, String species, char sex, Image image,int xPos, int yPos, String sound) {
        super(name, species, sex, image, sound, xPos, yPos);
    }
}
