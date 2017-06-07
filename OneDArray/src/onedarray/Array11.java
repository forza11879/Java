import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array11 {

    public static void main(String[] args) {
       File myFile = new File("myintegers.txt");

        int number;

        try {
            
            PrintWriter fileoutput = new PrintWriter(myFile);

            for (int i = 0; i < 10; i++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                number = input.nextInt();
                
                fileoutput.println(number);

                

            }
            fileoutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
