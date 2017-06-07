
public class Array {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[6];

        int max;
        int min;
        

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 50 + 1);
            System.out.print(myArray[i] + " ");
        }

        max = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }

        }

        min = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }

        }

        System.out.println(" ");
        System.out.println("Max: " + max + "  Mn : " + min + "  Diff :" + (max - min));

    }
}
