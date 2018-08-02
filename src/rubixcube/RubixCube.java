/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubixcube;

import java.util.ArrayList;
/**
 *
 * @author alan
 */

/**
 * 
 * RubixCube is an ArrayList of size 54, containing 6 faces (9 index each)
 * Front Face [0  - 8 ]
 * Back Face  [9  - 17]
 * Left Face  [18 - 26]
 * Right Face [27 - 35]
 * Up Face    [36 - 44]
 * Down Face  [45 - 53]
 * 
 */
public class RubixCube {
    
    private ArrayList<Square> cube = null;

    public RubixCube(){
        
    }
    
    public boolean isSolved(){
        if (!isSideSolved(0, 9))
            return false;
        if (!isSideSolved(9, 18))
            return false;
        if (!isSideSolved(18, 27))
            return false;
        if (!isSideSolved(27, 36))
            return false;
        if (!isSideSolved(36, 45))
            return false;
        if (!isSideSolved(45, 54))
            return false;
        
        return true;
        
    }
    
    private boolean isSideSolved(int startIndex, int endIndex){
        String startingColour = this.cube.get(startIndex).getColour();
        for(int i = startIndex; i < endIndex; i++){
            String currentColour = this.cube.get(i).getColour();
            if( !currentColour.equals(startingColour) )
                return false;
        }
        return true;
    }
    
    public ArrayList<Square> makeCube(){
        ArrayList<Square> l = new ArrayList();
        
        for(int i = 0; i < 54; i++){
            String colour = "";
            int pos = 0;
            if (i < 9){
                colour = "white";
                pos = i + 1;
            }
            else if (i < 18){
                colour = "yellow";
                pos = i + 1 -9;
            }
            else if (i < 27){
                colour = "orange";
                pos = i + 1 -18;
            }
            else if (i < 36){
                colour = "red";
                pos = i + 1 -27;
            }
            else if (i < 45){
                colour = "blue";
                pos = i + 1 -36;
            }
            else{
                colour = "green";
                pos = i + 1 -45;
            }
            
            Square s = new Square(colour, pos);
            l.add(s);
        }
        
        this.cube = l;
        
        return this.cube;
        
    }
    public void printCube(){
        if (this.cube == null)
            System.out.println("Cube has not been created yet!");
        else {
            printFace(0, 9);
            printFace(9, 18);
            printFace(18, 27);
            printFace(27, 36);
            printFace(36, 45);
            printFace(45, 54);
            
        }
        
    }
    
    /*
    The following moves occur for the U' move
    L1 -> F1
    L2 -> F2
    L3 -> F3
    F1 -> R1
    F2 -> R2
    F3 -> R3
    R1 -> B1
    R2 -> B2
    R3 -> B3
    B1 -> L1
    B2 -> L2
    B3 -> L3
    U1 -> U7
    U2 -> U4
    U3 -> U1
    U4 -> U8
    U5 -> U5
    U6 -> U2
    U7 -> U9
    U8 -> U6
    U9 -> U3
    */
    public ArrayList<Square> uDash() {
        Square buffer1;
        Square buffer2;
        Square buffer3;
        Square buffer4;
        Square buffer5;
        Square buffer6;
        Square buffer7;
        Square buffer8;
        
        buffer1 = this.cube.get(0); // store F1
        buffer2 = this.cube.get(27); // store R1
        buffer3 = this.cube.get(9); // store B1
        buffer4 = this.cube.get(18); // store L1
        
        this.cube.set(0, buffer4);
        this.cube.set(27, buffer1);
        this.cube.set(9, buffer2);
        this.cube.set(18, buffer3);
        
        buffer1 = this.cube.get(1); // store F2
        buffer2 = this.cube.get(28); // store R2
        buffer3 = this.cube.get(10); // store B2
        buffer4 = this.cube.get(19); // store L2
        
        this.cube.set(1, buffer4);
        this.cube.set(28, buffer1);
        this.cube.set(10, buffer2);
        this.cube.set(19, buffer3);
        
        buffer1 = this.cube.get(2); // store F3
        buffer2 = this.cube.get(29); // store R3
        buffer3 = this.cube.get(11); // store B3
        buffer4 = this.cube.get(20); // store L3
        
        this.cube.set(2, buffer4);
        this.cube.set(29, buffer1);
        this.cube.set(11, buffer2);
        this.cube.set(20, buffer3);
        
        buffer1 = this.cube.get(36); // store U1
        buffer2 = this.cube.get(37); // store U2
        buffer3 = this.cube.get(38); // store U3
        buffer4 = this.cube.get(39); // store U4
        buffer5 = this.cube.get(41); // store U6
        buffer6 = this.cube.get(42); // store U7
        buffer7 = this.cube.get(43); // store U8
        buffer8 = this.cube.get(44); // store U9
        
        this.cube.set(42, buffer1);
        this.cube.set(39, buffer2);
        this.cube.set(36, buffer3);
        this.cube.set(43, buffer4);
        this.cube.set(37, buffer5);
        this.cube.set(44, buffer6);
        this.cube.set(41, buffer7);
        this.cube.set(38, buffer8);
        
        
        
        return this.cube;
    }
    
    
    /*
    The following moves occur for the U move
    F1 -> L1
    F2 -> L2
    F3 -> L3
    B1 -> R1
    B2 -> R2
    B3 -> R3
    L1 -> B1
    L2 -> B2
    L3 -> B3
    R1 -> F1
    R2 -> F2
    R3 -> F3
    U1 -> U3
    U2 -> U6
    U3 -> U9
    U4 -> U2
    U5 -> U5
    U6 -> U8
    U7 -> U1
    U8 -> U4
    U9 -> U7
    */
    public ArrayList<Square> u() {
        Square buffer1;
        Square buffer2;
        Square buffer3;
        Square buffer4;
        Square buffer5;
        Square buffer6;
        Square buffer7;
        Square buffer8;
        
        buffer1 = this.cube.get(0); // store F1
        buffer2 = this.cube.get(27); // store R1
        buffer3 = this.cube.get(9); // store B1
        buffer4 = this.cube.get(18); // store L1
        
        this.cube.set(0, buffer2);
        this.cube.set(27, buffer3);
        this.cube.set(9, buffer4);
        this.cube.set(18, buffer1);
        
        buffer1 = this.cube.get(1); // store F2
        buffer2 = this.cube.get(28); // store R2
        buffer3 = this.cube.get(10); // store B2
        buffer4 = this.cube.get(19); // store L2
        
        this.cube.set(1, buffer2);
        this.cube.set(28, buffer3);
        this.cube.set(10, buffer4);
        this.cube.set(19, buffer1);
        
        buffer1 = this.cube.get(2); // store F3
        buffer2 = this.cube.get(29); // store R3
        buffer3 = this.cube.get(11); // store B3
        buffer4 = this.cube.get(20); // store L3
        
        this.cube.set(2, buffer2);
        this.cube.set(29, buffer3);
        this.cube.set(11, buffer4);
        this.cube.set(20, buffer1);
        
        buffer1 = this.cube.get(36); // store U1
        buffer2 = this.cube.get(37); // store U2
        buffer3 = this.cube.get(38); // store U3
        buffer4 = this.cube.get(39); // store U4
        buffer5 = this.cube.get(41); // store U6
        buffer6 = this.cube.get(42); // store U7
        buffer7 = this.cube.get(43); // store U8
        buffer8 = this.cube.get(44); // store U9
        
        this.cube.set(38, buffer1);
        this.cube.set(41, buffer2);
        this.cube.set(44, buffer3);
        this.cube.set(37, buffer4);
        this.cube.set(43, buffer5);
        this.cube.set(36, buffer6);
        this.cube.set(39, buffer7);
        this.cube.set(42, buffer8);
        
        
        
        return this.cube;
    }
    
    
    private void printFace(int startIndex, int finishIndex) {
        for(int i = startIndex; i < finishIndex; i++){
                String colour = this.cube.get(i).getColour();
                int pos = this.cube.get(i).getPosition();
                System.out.print(colour + Integer.toString(pos));
                System.out.print(", ");
            }
        System.out.println("");
    }
}
