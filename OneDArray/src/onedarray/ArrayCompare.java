import java.util.Scanner;
/**
 * @author Lorena Thais Henriquez Gamarra
 * Create in: November 15, 2016
 * Create a array with 6 elements with numbers between 1-49.
 * Allow user to write 6 numbers, check if this numbers are in array.
 * for 3 equal $10, 4 equal $100, 5 equal $1000, 6 equal $10000
 */
public class ArrayCompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont=0;
        int[] myRandom1 = new int[6];
        int[] myRandom2 = new int[6];
        //GENERATING RANDOM NUMBERS, USING METHOD AND PUTTING INSIDE OF A ARRAY
        for(int i=0; i<myRandom1.length; i++){
            myRandom1[i]=myRandom();
        }
        //ASKING FOR USER TO INPUT THE NUMBERS
        for(int i=0; i<myRandom1.length; i++){
            System.out.print("Enter a number for position "+i+" : ");
            myRandom2[i]=input.nextInt();
        }
        //DOING THE COMPARATION TO FOUND THE QUANTITIE OF EQUALS
        for(int i=0; i<myRandom2.length; i++){
            for(int j=0; j<myRandom1.length; j++){
                if(myRandom2[i] == myRandom1 [j]){
                    cont++;
                }
            }
        }
        //PRINTING THE RANDOM 
        System.out.print("\nRandom: ");
        for(int i=0; i<myRandom1.length; i++){
            System.out.print(" " + myRandom1[i]);
        }
        //PRINTING THE QUANTITIE OF EQUALS
        System.out.println("\nQuantitie: "+ cont);
        //PRINTING THE FINAL RESULT AND PRIZE
        switch (cont){
            case 3:
                System.out.println("Mach 3 numbers, your prize is $10");
                break;
            case 4:
                System.out.println("Mach 3 numbers, your prize is $100");
                break;
            case 5:
                System.out.println("Mach 3 numbers, your prize is $1,000");
                break;
            case 6:
                System.out.println("Mach 3 numbers, your prize is $10,000");
                break;
        }
    }
    //GENERATING RANDOM NUMBERS, USING METHOD
    public static int myRandom(){
        int myRandom=0;
        myRandom = (int)(Math.random()*49 + 1); //generates 1 - 50 (int) forces to be int
        return myRandom;
    }
}
