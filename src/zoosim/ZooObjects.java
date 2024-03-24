/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author menot
 */
public class ZooObjects implements IObject{
    private int degrees = 0;
    private int xPos;
    private int yPos;
    
    public ZooObjects(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
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