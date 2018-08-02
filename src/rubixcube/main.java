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
public class main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        RubixCube c = new RubixCube();
        c.makeCube();
        c.printCube();

        c.uDash();
        System.out.println("\n\n After U'\n\n");
        c.printCube();

        boolean r = c.isSolved();
        System.out.println("\n\n Solved: " + r + "\n\n");
//        
        c.u();
        System.out.println("\n\n After U\n\n");
        c.printCube();
        
        r = c.isSolved();
        System.out.println("\n\n Solved: " + r + "\n\n");
    }
    
}
