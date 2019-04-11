/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qouestion5;

import java.util.Scanner;

/**
 *
 * @author Andorid Developer
 */
public class Qouestion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc = new Scanner(System.in);
        float[] a=new float[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a float values");
            a[i]=abc.nextFloat();
        
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("float into integer"+(int)a[i]);
            
        }
    }
    
}
