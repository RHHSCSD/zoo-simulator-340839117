/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Represents the inanimate objects within the zoo
 *
 * @author Jaden Wickens
 */
public class ZooObjects implements IObject {

    private int degrees = 0;
    private int xPos;
    private int yPos;
    private int xWidth;
    private int yWidth;
    private String type;

    /**
     * Constructs an instance of ZooObjects with the specified parameters
     *
     * @param xPos the x-coordinate position of the object
     * @param yPos the y-coordinate position of the object
     * @param xWidth the width of the object along the x-axis
     * @param yWidth the width of the object along the y-axis
     * @param type what the object is
     */
    public ZooObjects(int xPos, int yPos, int xWidth, int yWidth, String type) {
        //set fields based on parameters
        this.xPos = xPos;
        this.yPos = yPos;
        this.xWidth = xWidth;
        this.yWidth = yWidth;
        this.type = type;
    }

    /**
     * Rotates the object by the specified degrees
     *
     * @param degrees the amount at which to rotate the object
     */
    @Override
    public void turn(int degrees) {
        // add turn degree to current direction faced
        this.degrees += degrees;
    }

    /**
     * A method to place to change the location of the object by placing it at
     * the specified coordinates.
     *
     * @param x The X position to be placed at
     * @param y The Y position for the object to be placed at
     */
    @Override
    public void place(int x, int y) {
        xPos = x;
        yPos = y;
    }
}
