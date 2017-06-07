public class SumTwoDarray {

   public static void main(String[] args) {

       int[][] myArray = new int[4][4];
       int total = 0;

       for (int row = 0; row < myArray.length; row++) {
           for (int column = 0; column < myArray[row].length; column++) {
               myArray[row][column] = (int) (Math.random() * 10 + 1);
               System.out.print(myArray[row][column] + " ");

           }
           System.out.println();

       }

       for (int column = 0; column < myArray[0].length; column++) {
           total = 0;
           for (int row = 0; row < myArray.length; row++) {

               total += myArray[row][column];

           }

           System.out.println("Sum for column " + column + " is " + total);
       }
       for (int row = 0; row < myArray[0].length; row++) {
           total = 0;
           for (int column = 0; column < myArray.length; column++) {

               total += myArray[row][column];

           }

           System.out.println("Sum for rows " + row + " is " + total);

       }
   }
}
