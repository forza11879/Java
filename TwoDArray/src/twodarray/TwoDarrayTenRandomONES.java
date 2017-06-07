
public class TwoDarrayTenRandomONES {

    public static void main(String[] args) {

       int[][] myArray = new int[10][10];
       int row, column;

       for (int i = 0; i < 10; i++) {
           row = (int) (Math.random() * 10);
           column = (int) (Math.random() * 10);
           myArray[row][column] = 1;
       }
       for (int r = 0; r < 10; r++) {
           for (int c = 0; c < 10; c++) {
               System.out.print(myArray[r][c] + " ");
               
           }System.out.println("");
       }

   }
}

