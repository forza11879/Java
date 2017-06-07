package simplecalc;

import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        int myChoice = 0;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println(" ");
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.println(" ");

            // myChoice = input.nextInt();
            do {
                System.out.println("Please Enter Your Choise:");
                myChoice = input.nextInt();
            } while (myChoice < 0 || myChoice > 4);

            if (myChoice == 1) {
                System.out.println(" ");
                System.out.println("Welcome to Addittion");
                System.out.println(" ");
                addition();

            } else if (myChoice == 2) {
                System.out.println(" ");
                System.out.println("Welcome to Substraction");
                System.out.println(" ");
                substraction();
                
            } else if (myChoice == 3) {
                System.out.println(" ");
                System.out.println("Welcome to Multiplication");
                System.out.println(" ");
                multiplication();
                
            } else if (myChoice == 4) {
                System.out.println(" ");
                System.out.println("Welcome to Division");
                System.out.println(" ");
                division();
                
            }
            
            

        } while (myChoice != 0);
    }

    public static void addition() {
        
        double number1;
        double number2;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first floating value:  ");
        number1 = input.nextDouble();
        
        
        System.out.print("Enter second floating value:  ");
        number2 = input.nextDouble();
        
        System.out.println( number1 + number2 );

    }
    
    public static void substraction() {
        
        double number1;
        double number2;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first floating value:  ");
        number1 = input.nextDouble();
        
        
        System.out.print("Enter second floating value:  ");
        number2 = input.nextDouble();
        
        System.out.println( number1 - number2 );

    }
    
    public static void multiplication() {
        
        double number1;
        double number2;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first floating value:  ");
        number1 = input.nextDouble();
        
        
        System.out.print("Enter second floating value:  ");
        number2 = input.nextDouble();
        
        System.out.println( number1 * number2 );

    }
    
    public static void division() {
        
        double number1;
        double number2;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first floating value:  ");
        number1 = input.nextDouble();
        
        
        System.out.print("Enter second floating value:  ");
        number2 = input.nextDouble();
        
        System.out.println( number1 / number2 );

    }

}
