/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Scanner;

/**
 *
 * @author Andorid Developer
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc=new Scanner(System.in);
        String[] a=new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data=");
            a[i]=abc.nextLine();
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(""+a[i]);
            
        }
        
    }
    
}
