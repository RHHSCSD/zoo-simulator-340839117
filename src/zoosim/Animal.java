/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.*; 

/**
 *
 * @author menot
 */
public class Animal implements IEntity{
    int id;
    String name;
    String Species;
    char sex;
    int age;
    int xPos;
    int yPos;
    int xWidth;
    int yWidth;
    int speed;
    int degrees = 0;
    int hunger = 0;
    int fatigue = 0;
    Image image;
    String sound;

    @Override
    public void move() {
        double radians = Math.toRadians(degrees);
        yPos += speed*Math.sin(radians);
        xPos += speed*Math.cos(radians);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public void eat() {
        hunger = 0;
        System.out.println("Animal is"+hunger+"% hungry");
    }

    @Override
    public void sleep() {
        fatigue = 0;
        System.out.println("Animal is"+fatigue+"% tired");
    }

    @Override
    public void turn(int degrees) {
        this.degrees += degrees;
    }

    @Override
    public void place(int x, int y) {
        xPos = x;
        yPos = y;
    }
    
    
}
