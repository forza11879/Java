public class Array10 {
    public static void main(String[] args) {

       int[] array = new int[10];
     

       int count = 0;
       int myNumber;
        while (count < array.length) {

           // Generate random number
           myNumber = (int) (Math.random() * 15 + 1);

           // Check where to place the number if it is not there       
           for (int i = 0; i < array.length; i++) {

               if (array[i] == 0) {
                   array[i] = myNumber;
                   count++;
                   break;
               }
               if (array[i] == myNumber) {
                   break;
               }
           }
        }

       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();

   }
}
