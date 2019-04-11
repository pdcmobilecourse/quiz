/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Andorid Developer
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arr=new int[10];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number");
            arr[i]=s.nextInt();
            
            
        }
        System.out.println("enter comparing number");
        int com=s.nextInt();
        boolean b=false;
        for (int i = 0; i < 10; i++) {
          if(arr[i]==com)
              b=true;
        }
        if(b==true)
            System.out.println("number is present");
        else
            System.out.println("number is not present");
              
        }
        {
            
        }
    }
    
}
