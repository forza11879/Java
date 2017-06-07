
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array13 {

    public static void main(String[] args) {
        int sum =0;
        int i =0;
        int numbers;
        File myFile = new File("myintegers.txt");
        
        try {
            
             Scanner fileInput = new Scanner(myFile);
            
            

            while ( fileInput.hasNextInt()) {
            numbers = fileInput.nextInt();
            System.out.println(numbers);
            sum = sum + numbers;
            }
            
            System.out.println("Sum is: " + sum);
            
                
            fileInput.close();
               
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
