package randarray;

public class RandArray {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];
        
        

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = (int) (Math.random() * 100 + 1);
            System.out.print(myArray[i] + " ");

            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }

        }

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] >= 70) {
                System.out.print(myArray[i] + " ");
            }

            /*if(isPrime(i)){
                System.out.println(i + " is a prime number");
            }else{
                System.out.println(i + " is not a prime number");
            }*/
        }
        
        {
        int i = 2, j = 3;
        
        int k = i++ +j;
        
        System.out.printf("k = %d, i = %d, j = %d\n", k, i, j);
        }

    }

    public static boolean isPrime(int number) {
        for (int a = 2; a <= number; a++) {

            if (a % number == 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
