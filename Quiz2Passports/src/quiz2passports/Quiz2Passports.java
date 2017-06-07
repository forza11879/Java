package quiz2passports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Passport {

    public Passport(String number, String firstName, String lastName, String address, String city, double heightCm, double weightKg, int yob) {

        setNumber(number);
        setFirstName(firstName);
        setLastName(lastName);
        setCity(city);
        setAddress(address);
        setHeightCm(heightCm);
        setWeightKg(weightKg);
        setYob(yob);

    }

    private String number; // passport number AB123456 format
    private String firstName, lastName, address, city; // at least 2 letters each
    private double heightCm, weightKg; // height from 0-300, weight 0-300
    private int yob; // year of birth - between 1900-2050

    public String getNumber() {
        return number;
    }

    private boolean isUpLet(char c) {
        return (c >= 65 && c <= 90);
    }

    private boolean isUpNumb(char w) {
        return (w >= 48 && w <= 57);
    }

    public void setNumber(String number) {
        
        if (number.length() != 6 || !isUpLet(number.charAt(0))
                || !isUpLet(number.charAt(1)) || !isUpNumb(number.charAt(2)) || !isUpNumb(number.charAt(3))
                || !isUpNumb(number.charAt(4)) || !isUpNumb(number.charAt(5)) || !isUpNumb(number.charAt(6))
                || !isUpNumb(number.charAt(7))) {
            throw new IllegalArgumentException("Passport number must be 2 uppercase letters and 6 numbers [0-9]: " + number);
        }
      
        this.number = number;
    }


    public String getFirstName() {
        return firstName;
    }

    private boolean isTowLet(char t) {
        return (t >= 97 && t <= 122);
    }

    public void setFirstName(String firstName) {
     
        if (firstName.length() != 2 || !isTowLet(firstName.charAt(0)) || !isTowLet(firstName.charAt(1))) {
            throw new IllegalArgumentException("Passport number must be 2 uppercase letters and 6 numbers [0-9]: " + firstName);
        }
     
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
      
        if (lastName.length() != 2 || !isTowLet(lastName.charAt(0)) || !isTowLet(lastName.charAt(1))) {
            throw new IllegalArgumentException("Passport number must be 2 uppercase letters and 6 numbers [0-9]: " + lastName);
        }
      
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        
        if (address.length() != 2 || !isTowLet(address.charAt(0)) || !isTowLet(address.charAt(1))) {
            throw new IllegalArgumentException("Passport number must be 2 uppercase letters and 6 numbers [0-9]: " + address);
        }
      
        this.address = address;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
      
        if (city.length() != 2 || !isTowLet(city.charAt(0)) || !isTowLet(city.charAt(1))) {
            throw new IllegalArgumentException("Passport number must be 2 uppercase letters and 6 numbers [0-9]: " + city);
        }
      
        this.city = city;
    }


    public double getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(double heightCm) {
        
        if (0 >= heightCm && heightCm >= 300) {
            throw new IllegalArgumentException("Height must be between [0-300]: " + heightCm);
        }
      
        this.heightCm = heightCm;
    }

    
    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
      
        if (0 >= weightKg && weightKg >= 300) {
            throw new IllegalArgumentException("Height must be between [0-300]: " + weightKg);
        }
        
        this.weightKg = weightKg;
    }


    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        
        if (1900 >= yob && yob >= 2050) {
            throw new IllegalArgumentException("Height must be between [0-300]: " + yob);
        }
        
        this.yob = yob;
    }

}

public class Quiz2Passports {

    static ArrayList<Passport> passList = new ArrayList<>();

    static final String FILE_NAME = "passports.txt";

    static Scanner input = new Scanner(System.in);

    private static int getMenuChoice() {
        while (true) {
            System.out.println("1. Display all passports data\n"
                    + "2. Display all passports for people in the same city\n"
                    + "3. Find the tallest person and display their info.\n"
                    + "4. Find the lightest person and display their info.\n"
                    + "5. Display all people younger than certain age.\n"
                    + "6. Add person to list.\n"
                    + "0. Save data back to file and exit.");
            System.out.print("Enter choice [0-6]: ");
            try {
                int choice = input.nextInt();
                input.nextLine();
                if (choice < 0 || choice > 6) {
                    System.out.println("Invalid choice, try again");
                } else {
                    return choice;
                }
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid choice, try again");
            }
        }
    }

    private static void saveAllDataToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME));
            for (Passport a : passList) {
                pw.printf("%s;%s;%s;%s;%s;%f;%f;%d\n", a.getNumber(), a.getFirstName(), a.getLastName(), a.getAddress(),
                        a.getCity(), a.getHeightCm(), a.getWeightKg(), a.getYob());
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error saving to file");

        }
    }

    private static void displayAllPassportsData() {

        for (int i = 0; i < passList.size(); i++) {
            Passport a = passList.get(i);
            System.out.printf("%s;%s;%s;%s;%s;%f;%f;%d\n", a.getNumber(), a.getFirstName(), a.getLastName(), a.getAddress(), a.getCity(), a.getHeightCm(), a.getWeightKg(), a.getYob());
            
        }

    }

    static void readPassport() throws FileNotFoundException {
        Scanner fileInput = new Scanner(new File(FILE_NAME));
        while (fileInput.hasNextLine()) {
            String fileLine = null;
            try {
                fileLine = fileInput.nextLine();
                String data[] = fileLine.split(";");
                if (data.length != 8) {
                    throw new IllegalArgumentException("Line malformed: " + fileLine);
                }
                String number = data[0];
                String firstName = data[1];
                String lastName = data[2];
                String city = data[3];
                String address = data[4];
                double heightCm = Double.parseDouble(data[5]);
                double weightKg = Double.parseDouble(data[6]);
                int yob = Integer.parseInt(data[7]);
                passList.add(new Passport(number, firstName, lastName, address, city, heightCm, weightKg, yob));
            } catch (IllegalArgumentException e) {
                System.out.println("Skipping invalid input line: " + fileLine);
            }
        }
        fileInput.close();
    }

    public static void main(String[] args) {

        try {
            readPassport();
            while (true) {
                int choice = getMenuChoice();
                switch (choice) {
                    case 0:
                        // save all airports back to file
                        saveAllDataToFile();
                        System.out.println("Goodbye");
                        return;
                    case 1:
                        displayAllPassportsData();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                       
                        break;
                    case 6:
                        
                        break;

                    default:
                        System.out.println("Internal fatal error. Terminating.");
                        System.exit(1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }

   
}
