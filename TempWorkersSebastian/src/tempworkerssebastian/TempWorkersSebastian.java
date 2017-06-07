/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempworkerssebastian;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidArgumentException extends Exception {


    InvalidArgumentException(String message) {
        super(message);
    }
}


class Workers {


    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private static int count;
    private static int ID;


    Workers(String name, LocalDate startDate, LocalDate endDate) throws InvalidArgumentException {


        setName(name);
        setStartDate(startDate);
        setEndDate(endDate);
        setID(ID);
        setCount(count);


    }


    public static int getCount() {
        return count;
    }


    public static void setCount(int aCount) {
        count = aCount;
    }


    public static int getID() {
        ID = count++;
        return ID;
    }


    public static void setID(int aID) {
        ID = aID;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {


        this.name = name;
    }


    public LocalDate getStartDate() {
        return startDate;
    }


    public void setStartDate(LocalDate startDate) {


        this.startDate = startDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }


    public void setEndDate(LocalDate endDate) {


        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return String.format("Worker Name: " + getName() + " ID: " + getID() + " Start Date: " + getStartDate() + " End Date: " + getEndDate() + "\n");
    }
}




public class TempWorkersSebastian {


    static ArrayList<Workers> personel = new ArrayList<>();
    static final String INPUT = "input.txt";


    static void listAll() throws InvalidArgumentException {
        try {
            Scanner read = new Scanner(new FileReader(INPUT));
            String in;
            String[] data = new String[3];
            while (read.hasNextLine()) {
                try {
                    in = read.nextLine();
                    data = in.split(";");
                    String name = data[0];
                    LocalDate startDate = convertStringToDate(data[1]);
                    LocalDate endDate = convertStringToDate(data[2]);
                    personel.add(new Workers(name, startDate, endDate));


                } catch (NumberFormatException | InvalidArgumentException e) {
                    System.out.println("Warning: invalid data " + e.getMessage());
                    continue; // unnecessary in this case
                }


            }


            for (Workers a : personel) {
                System.out.print(a);
            }
            read.close();
            System.out.println();


        } catch (FileNotFoundException e) {
            System.out.println("Warning: invalid data " + e.getMessage());
        }


    }


    private static void addWorker() throws IOException {
        try {
            Scanner in = new Scanner(System.in);


            System.out.println("Input Name");
            String name = in.nextLine();


            System.out.println("Input Start Date");
            String indate = in.nextLine();
            LocalDate startDate = convertStringToDate(indate);


            System.out.println("Input End Date");
            indate = in.nextLine();
            LocalDate endDate = convertStringToDate(indate);


            Workers a = new Workers(name, startDate, endDate);
            personel.add(a);


        } catch (InputMismatchException | InvalidArgumentException ime) {
            System.err.println(" Invalid Input. Terminating" + ime.getMessage());
        }


    }


    public static void findByDate(String date) {
        LocalDate compare = convertStringToDate(date);
        for (Workers a : personel) {
            if (a.getEndDate().isAfter(compare) && a.getStartDate().isBefore(compare)) {
                System.out.print(a);
            }
        }


    }


    public static void findByYear(String date) {
        LocalDate compare = convertStringToDate(date);
        for (Workers a : personel) {
            if (a.getEndDate().isBefore(compare) && a.getStartDate().isAfter(compare)) {
                System.out.print(a);
            } else {
                System.out.println(a);
            }
        }


    }


    public static void removeByID(int id) {


        personel.remove(id);
        System.out.println("Worker has been Removed");
        System.out.println();
        for (Workers a : personel) {
            System.out.print(a);
        }
    }
    
    private static void saveToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(INPUT));
            for (Workers a : personel) {
                pw.printf("%s;%s;%s\r\n", a.getName(), a.getStartDate(),
                        a.getEndDate());
            }
            pw.close();
        } catch (IOException e) {
            System.err.println("Error saving to file");
            // FIXME close the file anyway
        }
    }


    


    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("1. List all personel\n"
                        + "2. Find out who works on a specific date\n"
                        + "3. Ask for a year number and print out all dates"
                        + " in that year that nobody is scheduled to work on\n"
                        + "4. Add worker\n"
                        + "5. Delete worker by Id\n"
                        + "0. Exit\n");
                System.out.print("Choice: ");


                int choice = in.nextInt();
                in.nextLine(); //consume


                if ((choice < 0) || (choice > 5)) {
                    System.out.println("Choose between 1 to 4 or ZERO to exit");
                    continue;
                }
               


                switch (choice) {


                    case 1: {
                        listAll();
                    }
                    break;


                    case 2: {
                        System.out.println("Please enter a search date eg: YYYY/MM/DD ");
                        String date = in.nextLine();
                        findByDate(date);
                    }
                    break;
                    case 3: {
                        System.out.println("Please enter a search date eg: YYYY/MM/DD ");
                        String date = in.nextLine();
                        findByYear(date);
                    }
                    break;
                    case 4:
                        addWorker();
                        break;
                    case 5:{
                        System.out.println("Please enter Worker ID");
                        int id = in.nextInt();
                        removeByID(id);
                    }
                        break;
                    case 0:
                        saveToFile();
                        System.out.println("Have a Nice Day :D!!!!");


                        break;
                    default:
                        System.err.println("Fatal error: invalid control flow: SHIFT HAPPENS");


                        System.exit(1);


                }//end swich


            } catch (InvalidArgumentException | IOException e) {
                System.out.println("Warning: invalid data " + e.getMessage());
            }//end while loop


        }


//            } catch (IOException e) {
//                System.err.println("Error reading file");
//            }
    }


    public static LocalDate convertStringToDate(String dateString) {
//        String string = "January 2, 2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(dateString, formatter);
        return date;
    }


    public static LocalDate converToYear(String dateString) {
//        String string = "January 2, 2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY");
        LocalDate date = LocalDate.parse(dateString, formatter);
        return date;
    }


}
