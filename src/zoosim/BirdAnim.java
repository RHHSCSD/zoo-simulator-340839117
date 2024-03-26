/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author menot
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean canFly;
    private static final String BIRD_SOUND = "Tweet Tweet";
    private int height = 0;
    
    public BirdAnim(String name, String species, char sex, int speed, int age, Image image, boolean canFly) {
        super(name, species, sex, speed, age, image, BIRD_SOUND);
        this.canFly = canFly;
    }
    public BirdAnim(String name, String species, char sex, Image image,int xPos, int yPos, boolean canFly) {
        super(name, species, sex, image, BIRD_SOUND, xPos, yPos);
        this.canFly = canFly;
    }
    
    @Override
    public void fly() {
        if (canFly){
            height ++;
        }else{
            System.out.println(name + " jumped but is still on the ground becase they cannot fly");
        }
    }

    @Override
    public void land() {
        height = 0;
    }

    @Override
    public void isFlying() {
        if (height>0){
            System.out.println(name+" is currently flying at a hight of "+height);
        }else{
            System.out.println(name+" is not currently flying");
        }
            
    }
    
}
