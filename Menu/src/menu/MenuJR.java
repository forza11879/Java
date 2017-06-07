
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class MenuJR {

    public static void main(String[] args) {

        int myChoice = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Welcome to IDP Casino!");
            System.out.println("----------------------");
            System.out.println(" ");
            System.out.println("1. Play Craps!");
            System.out.println("2. Play MaxNumber!");
            System.out.println("3. Exit");
            System.out.println(" ");

            // myChoice = input.nextInt();
            do {

                System.out.println("Please Enter Your Choise:");
                myChoice = input.nextInt();
            } while (myChoice < 1 || myChoice > 3);

            if (myChoice == 1) {
                System.out.println(" ");
                System.out.println("Welcome to the gane of Craps!");
                System.out.println(" ");

            } else if (myChoice == 2) {
                System.out.println(" ");
                System.out.println("Welcome to the game of MaxNumber!!");
                System.out.println(" ");
            }

        } while (myChoice != 3);
    }

}
