/**
 * @author Lorena Thais Henriquez Gamarra
 * Create in: November 14, 2016
 * Last Update: November 15, 2016
 * Assignment 02 / Question 02
 */
public class ArrayDice {
    public static void main(String[] args) {
        int toss=0, cont=0, choise=0;
        int[] myRandom1, myRandom2, sum;
        //CREATIND A LOOP TO TROW TWO DICES 6X
        //IF THE SUM IS EQUAL 7, LEAVE THE GAME
        toss = 6;
        cont = 1;
        
        myRandom1= new int[toss];
        myRandom2= new int[toss];
        sum=new int[toss];
        
        System.out.println("Welcome to Craps");
        //GENERATING RANDOM NUMBERS, USING METHOD AND PUTTING INSIDE OF A ARRAY
        //DOING THE SUM OF EACH ELEMENT, IN PAIRS
        for(int i=0; i<toss; i++){
            myRandom1[i]=myRandom();
            myRandom2[i]=myRandom();
            sum[i] = myRandom1[i] + myRandom2[i];
            
            System.out.println("\nToss number: " + cont);
            System.out.print("\nDice 1: " + myRandom1[i]);
            System.out.print("\nDice 2: " + myRandom2[i]);
            System.out.print("\nSum: " + sum[i]);
            toss--;
            cont++;
            if (sum[i] != 7 && toss==0){
                System.out.println(i);
                System.out.println("\nBetter luck next time! Play again\n\n");
            }
            else{
                System.out.println("\nYou are a winner …\n\n");
                break;
            }
        }
    }
    //GENERATING RANDOM NUMBERS, USING METHOD
    public static int myRandom(){
        int myRandom=0;
        myRandom = (int)(Math.random()* (7-1) + 1); //generates 1 to 6. (int) forces to be int
        return myRandom;
    }
}
