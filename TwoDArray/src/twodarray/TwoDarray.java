
public class TwoDarray {

    public static void main(String[] args) {
        
        int [][] myArray = new int[4][4];
        

        for (int row = 0; row < myArray.length; row++) {
           for (int column = 0; column < myArray[row].length; column++) {
               myArray [row][column] = (int)(Math.random() * 10 );
               System.out.print(myArray [row][column] + " " );
    
           }
           System.out.println();
           
        }
   }

}


