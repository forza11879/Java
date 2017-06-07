package menu;

import java.util.Scanner;

public class TeacherMenuBreak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add person info\n"
                    + "2. List persons info\n"
                    + "3. Find a person by name\n"
                    + "4. Find all persons younger than age\n"
                    + "0. Exit\n");

            int choice = input.nextInt();
            if ((choice < 0) || (choice > 4)) {
                System.out.println("Invalid choice");
                continue;
            }
            if (choice == 0) {
                System.out.println("Good bye!");
                return;
            }
            
            System.out.println("Enter two floating point values");
            double v1 = input.nextDouble();
            double v2 = input.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = v1 + v2;
                    break;
                case 2:
                    result = v1 - v2;
                    break;
                case 3:
                    result = v1 * v2;
                    break;
                case 4:
                    result = v1 / v2;
                    break;
                default:
                    System.err.println("Fatal error: invalid control flow");
                    System.exit(1);
            }
            System.out.printf("Result is: %.4f", result);
        }
    }

}
