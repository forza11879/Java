
//import java.util.Scanner;
/**
 *
 * @author ipd
 */
public class DiceToss {

    public static void main(String[] args) {

        int tossNumber1 = 0;
        int tossNumber2 = 0;
        int attempt = 0;
        int sum = 0;

        //Scanner input = new Scanner(System.in);
        //System.out.print("Input the number of throws (1 to 7): ");
        //attempt = input.nextInt();
        //tossNumber1 = (int) (Math.random() * 6 + 1);
        //System.out.println("Random number from (1 to 6):" + tossNumber1);

        //tossNumber2 = (int) (Math.random() * 6 + 1);
        //System.out.println("Random number from (1 to 6):" + tossNumber2);

        //sum = tossNumber1 + tossNumber2;

        do {
            
            tossNumber1 = (int) (Math.random() * 6 + 1);
            System.out.println("Random number from (1 to 6):" + tossNumber1);
            
            
            tossNumber2 = (int) (Math.random() * 6 + 1);
            System.out.println("Random number from (1 to 6):" + tossNumber2);
            
            
            sum = tossNumber1 + tossNumber2;
            System.out.println("Sum: " + sum);
            
            System.out.println("Atempt: " + attempt);
            
            
            
            // this is good
            //if (sum == 7) {
            //    System.out.println("you won: "+ sum );
            //    attempt = 8;
            //} else {
                
           // }
           attempt = attempt + 1;
        } while (attempt < 7 && sum !=7 );

    }

}

            