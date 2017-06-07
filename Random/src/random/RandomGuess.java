import java.util.Scanner;
/**
 *
 * @author ipd
 */
public class RandomGuess 
{
    public static void main(String[] args) 
    {
        
        int myRandom1 = 0;
        int num1 = 0;
        
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guess the random number from (1 to 20):" );
        System.out.print("Input the number from (1 to 20):" );       
        num1 = input.nextInt();
        
        myRandom1 = (int)(Math.random()*21 + 1);
        System.out.println("Random number from (1 to 20):" + myRandom1 );
        
        if (myRandom1 > num1 )
        {
        System.out.println("The answer to guess is higher: ");
        } 
        else if( myRandom1 < num1 ) 
        {
         System.out.println("The answer to guess is lower: ");
        }
        else 
        {
         System.out.println("The numbers are equal");
        }
    }
    
}    
        
        

