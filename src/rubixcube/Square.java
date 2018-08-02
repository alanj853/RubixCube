/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubixcube;

/**
 *
 * @author alan
 */
public class Square {

    
    
    private String colour = "";
    private int position = -1;
    
    public Square(String colour, int position){
        this.colour = colour;
        this.position = position;
    }
    
    public Square(String colour){
        this.colour = colour;
    }
    
    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(int position) {
        this.position = position;
    }
    
}
