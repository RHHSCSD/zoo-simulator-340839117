/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Represents objects that can fly
 *
 * @author Jaden Wickens
 */
public interface IFlyable {

    /**
     * Instructs the object to fly.
     */
    public void fly();

    /**
     * Instructs the object to land.
     */
    public void land();

    /**
     * Checks if the object is currently flying.
     *
     * @return true if the object is flying, false otherwise
     */
    public boolean isFlying();
}
