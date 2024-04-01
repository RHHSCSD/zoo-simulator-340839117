/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Represents the visual representations (images) shown of the zoo objects
 *
 * @author Jaden Wickens
 */
public class Image {

    private int width;
    private int height;

    /**
     * Constructs an instance of the Image class with specified parameters
     *
     * @param w the width of the image
     * @param h the height of the image
     */
    public Image(int w, int h) {
        width = w;
        height = h;
    }

    /**
     * Gets the width of the image
     *
     * @return the width of the image as an int
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the height of the image
     *
     * @return the height of the image as an int
     */
    public int getHeight() {
        return height;
    }
}
