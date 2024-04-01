/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * The IEntity interface represents entities in the system, extending the
 * IObject interface. It defines common behaviors for entities.
 *
 * @author Jaden Wickens
 */
public interface IEntity extends IObject {

    /**
     * Moves the entity.
     */
    public void move();

    /**
     * Makes a sound associated with the entity.
     */
    public void makeSound();

    /**
     * Simulates the entity eating.
     */
    public void eat();

    /**
     * Simulates the entity sleeping.
     */
    public void sleep();
}
