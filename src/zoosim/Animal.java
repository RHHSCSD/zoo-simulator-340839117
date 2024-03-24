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

    public Animal(String name, String species, char sex, int speed, int age, Image image, String sound) {
        animalSetter(name, species, sex, image, sound);     
        
        this.age = age;
        
        if (speed>maxSpeed && speed<minSpeed){
            this.speed = speed;
        }else{
            this.speed = 5;
        }
    }
    
    public Animal (String name, String species, char sex, Image image, String sound, int xPos, int yPos) {
        animalSetter(name, species, sex, image, sound);
        this.age = 0;
        this.speed = 0;
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void animalSetter(String name, String species, char sex, Image image, String sound){
        idSave ++;
        id = idSave;
        
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.sound = sound;
        
        xWidth = image.getWidth();
        yWidth = image.getHeight();
    }
   
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
