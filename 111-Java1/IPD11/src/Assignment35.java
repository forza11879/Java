import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment35 {

    
    public static void main(String[] args) {

        int[][] myArray = new int[5][5];
        int myNumber;

        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        File myFile = new File("bingo.txt");
        System.out.println("BINGO");
        
        try {
            PrintWriter fileoutput = new PrintWriter(myFile);

            while (count < myArray.length) {
  
                myNumber = (int) (Math.random() * 15 + 1);
  
                for (int i = 0; i < myArray.length; i++) {

                    if (myArray[i][0] == 0) {
                        myArray[i][0] = myNumber;
                        count++;
                        break;
                    }
                    if (myArray[i][0] == myNumber) {
                        break;
                    }
                }

            }

            while (count1 < myArray.length) {

                myNumber = (int) (Math.random() * 15 + 16);
    
                for (int i = 0; i < myArray.length; i++) {

                    if (myArray[i][1] == 0) {
                        myArray[i][1] = myNumber;
                        count1++;
                        break;
                    }
                    if (myArray[i][1] == myNumber) {
                        break;
                    }
                }
            }

            while (count2 < myArray.length) {

                myNumber = (int) (Math.random() * 15 + 31);
     
                for (int i = 0; i < myArray.length; i++) {

                    if (myArray[i][2] == 0) {
                        myArray[i][2] = myNumber;
                        count2++;
                        break;
                    }
                    if (myArray[i][2] == myNumber) {
                        break;
                    }
                }
            }

            while (count3 < myArray.length) {

                myNumber = (int) (Math.random() * 15 + 46);
    
                for (int i = 0; i < myArray.length; i++) {

                    if (myArray[i][3] == 0) {
                        myArray[i][3] = myNumber;
                        count3++;
                        break;
                    }
                    if (myArray[i][3] == myNumber) {
                        break;
                    }
                }
            }

            while (count4 < myArray.length) {

                myNumber = (int) (Math.random() * 15 + 61);
      
                for (int i = 0; i < myArray.length; i++) {

                    if (myArray[i][4] == 0) {
                        myArray[i][4] = myNumber;
                        count4++;
                        break;
                    }
                    if (myArray[i][4] == myNumber) {
                        break;
                    }
                }
            }

            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    System.out.print(myArray[r][c] + "   ");
                    fileoutput.print(myArray[r][c]+" ");

                }
                System.out.println("  ");
                fileoutput.println("  ");
            }
            fileoutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
