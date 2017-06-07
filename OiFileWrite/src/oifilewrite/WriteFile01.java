import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;



import java.io.*;

public class WriteFile01 {

    public static void main(String[] args) {
        
        File myFile = new File("mytextfile.txt");
        
        try {
            
            PrintWriter myFileOutput = new PrintWriter(myFile);
            
            myFileOutput.println("Lorena Gamarra");
            myFileOutput.println("Matthew Stinis");
            
            myFileOutput.close();
            
        }
        
        catch (Exception e){
            e.printStackTrace();
            
        }
    }
    
}
