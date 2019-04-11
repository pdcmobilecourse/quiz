/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import java.util.Scanner;

/**
 *
 * @author Andorid Developer
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc=new Scanner(System.in);
        
        int [] a=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data=");
            a[i]=abc.nextInt();
            
            
        }
        int product=1;
        for (int i = 0; i < 10; i++) {
            product=product*a[i];
            
        }
        System.out.println("the product of number is "+product);
    }
    
}
