/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidabintang;

/**
 *
 * @author user
 */
public class PiramidaBintang {

    public static void main(String[] args) {
        int z = 8;
        
        for (int i=1; i<z; i++) {
            for (int j=1; j<z-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<(i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
