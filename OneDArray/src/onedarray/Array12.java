import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array12 {

    
    public static void main(String[] args) {
        int nextNumber;
        
        File myFile = new File("myintegers.txt");
        Scanner input = new Scanner(System.in);
        try {
            PrintWriter myfileoutput = new PrintWriter(myFile);


            for (int i = 0; i < 10; i++) {
                System.out.println("Enter a Number: ");
                nextNumber = input.nextInt();
                myfileoutput.println(nextNumber);
            }
            myfileoutput.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
