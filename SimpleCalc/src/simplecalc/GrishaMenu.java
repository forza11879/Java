/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

/**
 *
 * @author ipd
 */


    import java.util.Scanner;


public class GrishaMenu {

   
   public static void main(String[] args) {
       double number1 = 0;
       double number2 = 0;
       double total = 0;
       int choice;
       int count = 0;
       Scanner input = new Scanner(System.in);

       while (count == 0) {
           System.out.println("\n1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. EXIT");
           System.out.print("\nPlease enetr your choice:");
           choice = input.nextInt();
           if (choice == 1) {
               System.out.print("Please enter first number: ");
               number1 = input.nextDouble();
               System.out.print("\nPlease enter second number: ");
               number2 = input.nextDouble();
               total = number1 + number2;
               System.out.println("Result is: " + total);

           }

           if (choice == 2) {
               System.out.print("Please enter first number: ");
               number1 = input.nextDouble();
               System.out.print("\nPlease enter second number: ");
               number2 = input.nextDouble();
               total = number1 - number2;
               System.out.println("Result is: " + total);

           }
           if (choice == 3) {
               System.out.print("Please enter first number: ");
               number1 = input.nextDouble();
               System.out.print("\nPlease enter second number: ");
               number2 = input.nextDouble();
               total = number1 * number2;
               System.out.println("Result is: " + total);

           }

           if (choice == 3) {
               System.out.print("Please enter first number: ");
               number1 = input.nextDouble();
               System.out.print("\nPlease enter second number: ");
               number2 = input.nextDouble();
               total = number1 * number2;
               System.out.println("Result is: " + total);

           }

           if (choice == 4) {
               System.out.print("Please enter first number: ");
               number1 = input.nextDouble();
               System.out.print("\nPlease enter second number: ");
               number2 = input.nextDouble();
               total = number1 / number2;
               System.out.println("Result is: " + total);

           }

           if (choice == 5) {
               count = count + 1;
           }
           if (choice < 1 || choice > 5) {
               System.out.println("ERROR");
           }

       }

   }

}
