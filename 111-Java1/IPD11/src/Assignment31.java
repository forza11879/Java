
public class Assignment31 {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int count = 0;

        while (count < array1.length) {
            int randomNumber;
            randomNumber = (int) (Math.random() * 20 + 1);

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == 0) {
                    array1[i] = randomNumber;
                    count = count + 1;
                    break;
                }
                if (array1[i] == randomNumber) {
                    break;
                }

            }

        }

        System.arraycopy(array1, 0, array2, 0, array1.length);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");

        }
        System.out.println("");

        for (int i = 0; i < array2.length / 2; i++) {
            int j = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = j;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");

        }

    }
}
