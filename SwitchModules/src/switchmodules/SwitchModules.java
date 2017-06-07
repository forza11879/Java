
import java.util.Scanner;

/**
 *
 * @author ipd
 */
public class SwitchModules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("Please Enter Your a Number:");
        num = input.nextInt();

        switch (num = num % 3) {

            case 0:
                System.out.println("Number can be divided by 3");
                break;

            case 1:
                System.out.println("Number cannot be divided by 3, Remainder " + num);
                
                break;

            case 2:
                System.out.println("Number can be divided by 3, Remainder " + num);
                
                break;
        }
    }
    // TODO code application logic here
}
