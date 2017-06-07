
public class TwoDarrayZeroOne {

    public static void main(String[] args) {

       int[][] myArray = new int[6][6];

        for (int row = 0; row < myArray.length; row++) {
            for (int column = 0; column < myArray[row].length; column++) {
                if ((row % 2 == 0) && (column % 2 == 0)) {
                   myArray[row][column] = 1;
                } else if ((row % 2 == 1) && (column % 2 == 1)) {
                   myArray[row][column] = 1;
                }

            }
           
        }
        for (int row = 0; row < myArray.length; row++) {
            for (int column = 0; column < myArray[row].length; column++) {
               System.out.print(myArray[row][column] + " ");
            }
   
           System.out.println("");
        }
    }

}
