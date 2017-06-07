
public class TwoDarrayBingo {

        public static void main(String[] args) {

       int[][] myArray = new int[5][5];
       
       

        for (int row = 0; row < 5; row++) {
           myArray[row][0] = (int) (Math.random() * 15 + 1) ;
        }
        
        for (int row = 0; row < 5; row++) {
           myArray[row][1] = (int) (Math.random() * 15 + 16) ;
        }
        
        for (int row = 0; row < 5; row++) {
           myArray[row][2] = (int) (Math.random() * 15 + 31) ;
        }
        
        for (int row = 0; row < 5; row++) {
           myArray[row][3] = (int) (Math.random() * 15 + 46) ;
        }
        
        for (int row = 0; row < 5; row++) {
           myArray[row][4] = (int) (Math.random() * 15 + 61) ;
        }

       for (int r = 0; r < 5; r++) {
           for (int c = 0; c < 5; c++) {
               System.out.print(myArray[r][c] + " ");
               
           }System.out.println("");
       }

   }
}



