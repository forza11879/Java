package filesaveread;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.text.html.HTML;

public class FileSaveRead {

    static Scanner input = new Scanner (System.in);
    
    static int inputInt(String message) {
        System.out.println(message);
        int value = input.nextInt();
        input.nextLine(); //consume left-over new line character
        return value;
        
    }

    public static void main(String[] args) throws IOException {

       

        try {

            System.out.println("Enter your name");
            String name = input.nextLine();
            System.out.println("Eneter your age");
            int age = input.nextInt();
            input.nextLine(); // consume left-over new line character
            System.out.println("Enter your city");
            String city = input.nextLine();
            
            PrintWriter pw = new PrintWriter(new FileWriter ("data.txt"));
            pw.printf("%s is %d years old lives is %s", name,age,city);
            pw.close();
            
            Scanner fileInput = new Scanner (new File (HTML.Attribute.data.txt))

            
            
            }


            myFileOutput.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        
        
        
        
    }

}
