/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class SumProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2 = 0;
        int theSum = 0;
        int theProduct = 0;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter first number: ");
        num1 = input.nextInt();
       
        System.out.print("Please enter second number: ");
        num2 = input.nextInt();
        
        theSum = num1 + num2;
        theProduct = num1 * num2;
        
        System.out.println("The sum of the numbers is : " + theSum);
        System.out.println("The product of the numbers is : " + theProduct);
              
        
        
    }
    
}
