/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * The IObject interface represents objects in the system. It defines basic
 * behaviors for objects.
 *
 * @author Jaden Wickens
 */
public interface IObject {

    /**
     * Turns the object by the specified degrees.
     *
     * @param degrees the degrees to rotate the object
     */
    public void turn(int degrees);

    /**
     * Places the object at the specified position.
     *
     * @param x the x-coordinate position to place the object
     * @param y the y-coordinate position to place the object
     */
    public void place(int x, int y);
}
