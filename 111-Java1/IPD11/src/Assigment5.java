import java.util.Scanner;


public class Assigment5 {


    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        title();
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First number: ");
        number1 = input.nextInt();
        System.out.println("Enter Second number: ");
        number2 = input.nextInt();
        
        int largest = max(number1, number2);
        System.out.println("the largest of the two numbers: " + largest);
    }


    public static void title() {
        String title;
        System.out.println("********************");
        System.out.println("* This is my TITLE *");
        System.out.println("********************");


    }


    public static int max(int number1, int number2) {
       
        if (number1 > number2) {
            //System.out.println("Number1 is bigger");
            return number1;
        } else if (number2 > number1) {
            //System.out.println("Number2 is bigger");
            return number2;
        } else //System.out.println("Numbers are equal");
        {
            return number1;
        }
    }


}