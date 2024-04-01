/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * Represents objects that can swim
 *
 * @author Jaden Wickens
 */
public interface ISwimmable {

    /**
     * Checks if an object can survive on the surface
     *
     * @return true if the animal can breathe on the surface, false if it cant
     */
    public boolean canSurface();
}
