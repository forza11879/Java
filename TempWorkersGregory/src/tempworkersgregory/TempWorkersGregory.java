package tempworkersgregory;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


class Worker {


    private String name;
    private Date startDate;
    private Date endDate;


    private static int count;
    private int uniqueId;


    public Worker(String name, Date startDate, Date endDate) {


        setName(name);
        setStartDate(startDate);
        setEndDate(endDate);
        getUniqueId();


        count++;
        uniqueId = count;
    }


    /////uniqueID
    public static int getCount() {
        return count;
    }


    public int getUniqueId() {
        return uniqueId;
    }


    private void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    private void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Date getStartDate() {
        return startDate;
    }


    private void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public Date getEndtDate() {
        return endDate;
    }


}


/**
 *
 * @author Grisha
 */
public class TempWorkersGregory {


    static void readPersonel() throws FileNotFoundException, ParseException {
        Scanner fileInput = new Scanner(new File("input.txt"));
        while (fileInput.hasNextLine()) {
            String fileLine = null;
            try {
                fileLine = fileInput.nextLine();
                String data[] = fileLine.split(";");
                if (data.length != 3) {
                    throw new IllegalArgumentException("Line malformed: " + fileLine);
                }
                String name = data[0];
                DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                Date startDate = format.parse(data[1]);
                Date endDate = format.parse(data[2]);
                personel.add(new Worker(name, startDate, endDate));
            } catch (IllegalArgumentException e) {
                System.err.println("Skipping invalid input line: " + fileLine);
            }
        }
        fileInput.close();
    }
    static ArrayList<Worker> personel = new ArrayList<>();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) throws FileNotFoundException, ParseException {


        readPersonel();


        System.out.println("1. List all personel\n"
                + "2. Find out who works on a specific date\n"
                + "3. Ask for a year number and print out all dates\n"
                + "in that year that nobody is scheduled to work on\n"
                + "4. Add worker\n"
                + "5. Delete worker by Id\n"
                + "0. Exit");


        for (;;) {
            System.out.print("\nChoice: ");


            int choice = input.nextInt();


            switch (choice) {
                case 1:
                    showPersonel();
                    break;
                case 2:
                    findByDate();
                    break;
                case 3:
                    findByYear();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    continue;
                default:
                    System.out.println("WEMESSEDUP!!");


            }
        }


    }


    private static void showPersonel() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");


        for (Worker w : personel) {
            System.out.printf("%s: %s - Start date:%td %tB %tY End date:%td %tB %tY\n ", w.getUniqueId(), w.getName(), w.getStartDate(), w.getStartDate(), w.getStartDate(), w.getEndtDate(), w.getEndtDate(), w.getEndtDate());
        }
    }


    private static void findByYear() {
        Calendar myCal = new GregorianCalendar();
        System.out.print("\nPlease enter a year");
        int date = input.nextInt();
        date = date - 1900;
        for (Worker w : personel) {
            if (date == w.getStartDate().getYear()) {
                System.out.println(w.getName() + "    " + w.getStartDate());
            }
        }


    }


    private static void findByDate() {
        String line = null;
        Date date;
        
        System.out.print("\nPlease enter a date (yyyy/MM/dd): ");
        line = input.next();
        try {
         DateFormat format = new SimpleDateFormat("yyyy/MM/dd");   
            date = format.parse(line);
            for (Worker w : personel) {
                if (date.after(w.getStartDate()) && date.before(w.getEndtDate())) {
                    System.out.println("Name: " + w.getName() + "  was working during that date ");
                }
            }
        } catch (ParseException e) {
            System.out.println("Sorry, that's not valid. Please try again.");
        }


    }


}