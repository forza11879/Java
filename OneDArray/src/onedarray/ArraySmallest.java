/**
 * @author Lorena Thais Henriquez Gamarra
 * Create in: November 15, 2016
 * Create a array with 50 elements. Show largest and the smallest
 */
public class ArraySmallest {
    public static void main(String[] args) {
        int largest=0, smallest=0;
        int[] myRandom1 = new int[50];

        //GENERATING RANDOM NUMBERS, USING METHOD AND PUTTING INSIDE OF A ARRAY
        for(int i=0; i<myRandom1.length; i++){
            myRandom1[i]=myRandom();
            System.out.print("Index: "+ i);
            System.out.println(" Value: "+ myRandom1[i]);
        }
        smallest=myRandom1[0];
        largest=myRandom1[0];
        //CHECKING WICH ONE IS THE LARGEST AND SMALLEST
        for (int i=0; i<myRandom1.length; i++){
                if(myRandom1[i] > largest){
                    largest = myRandom1[i];
                }
                if(myRandom1[i] < smallest){
                    smallest = myRandom1[i];
            }
        }
        
        System.out.print("\n\nThe Largest is: "+ largest);
        System.out.print("\n\nThe Smallest is: "+ smallest);
        System.out.println();
    }
    //GENERATING RANDOM NUMBERS, USING METHOD
    public static int myRandom(){
        int myRandom=0;
        myRandom = (int)(Math.random()*50 + 1); //generates 1 - 50 (int) forces to be int
        return myRandom;
    }
}
