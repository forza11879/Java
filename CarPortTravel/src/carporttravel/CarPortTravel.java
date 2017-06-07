//CarPortTravel
//carporttravel
package carporttravel;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;


class Airport {


    Airport(String code, String city, double latitude, double longitude) {
        setCode(code);
        setCity(city);
        setLatitude(latitude);
        setLongitude(longitude);


    }
    private String code;
    private String city;
    private double latitude;
    private double longitude;


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        if (code.equals("") || code.equals(null)) {
            throw new IllegalArgumentException("Airport cannot be emty");
        }
        this.code = code;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        if (city.equals("") || city.equals(null)) {
            throw new IllegalArgumentException("Airport code cannot be emty");
        }
        this.city = city;
    }


    public double getLatitude() {
        return latitude;
    }


    public void setLatitude(double latitude) {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude must be between -90 and 90");
        }
        this.latitude = latitude;
    }


    public double getLongitude() {
        return longitude;
    }


    public void setLongitude(double longitude) {
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Longitude must be between -180 and 180");
        }
        this.longitude = longitude;
    }
}


public class CarPortTravel {


    static Scanner input = new Scanner(System.in);


    static int inputInt(String message) {
        for (;;) {
            try {
                System.out.println(message);
                int value = input.nextInt();
                input.nextLine();
                return value;
            } catch (InputMismatchException ime) {
                System.out.println("Wrong input");
                input.nextLine();
            }
        }
    }


    private static final String FILE_NAME = "airports.txt";
    static ArrayList<Airport> airports = new ArrayList<>();


    public static void main(String[] args) {


        String line, code, city, latstring, lonstring;
        double latitude, longitude;


        try {
            Scanner read = new Scanner(new FileReader(FILE_NAME));
            while (read.hasNext()) {
                line = read.nextLine();
                //line.replaceAll("\\r?\\n", "");//поидее эта штука должна убирать все знаки новых линий но я думаю будет работать и без нее
                StringTokenizer tokenizer = new StringTokenizer(line, ";");// эта штука позволяет разбить линию на состовляющте и мы можем указать какой символ является знаком к разбиению
                //работает только когда все стринг
                code = tokenizer.nextToken(); // первый элемент разбиения
                city = tokenizer.nextToken();//второй
                latstring = tokenizer.nextToken();// третий
                lonstring = tokenizer.nextToken();// четвертый
                latitude = Double.parseDouble(latstring);//преобразует стринг в дабл
                longitude = Double.parseDouble(lonstring);//преобразует стринг в дабл
                //System.out.println(code + "  " + city + "  " + latitude + "  " + longitude);// выводит для проверки себя в принципе нафиг не нужна
                Airport a = new Airport(code, city, latitude, longitude); // передает конструктору
                airports.add(a);//данные идут в массив
            }
            read.close();
        } catch (IOException ioe2) {
            System.out.println("Shift Happens =====>>> Call 9-1-1");
        }
        menu();
    }


    private static void menu() {
        System.out.println("1. Show all airports (codes and city names)\n"
                + "2. Find distance between two airports by codes.\n"
                + "3. Find the 2 airports nearest to an airport given and display the distance.\n"
                + "4. Add a new airport to the list.\n"
                + "0. Exit.");
        int choice = inputInt("Choice: ");
        if ((choice < 0) || (choice > 4)) {
            System.out.println("Invalid choice.");
            return;
        }
        switch (choice) {
            case 0:
                System.out.println("Bye bye");
                //count = count + 1;
                return;
            case 1:
                showAirports();
                break;
            case 2:
                computeDistance();
                break;
            case 3:
                findNearest();
                break;
            case 4:
                addAirport();
                break;
            default:
                System.out.println("1-800-WEMESSEDUP");
                System.exit(1);
        }
    }


    private static void showAirports() {
        for (Airport a : airports) {
            System.out.printf("p: code=%s, city=%s, latitude=%f, longitude=%f\n", a.getCode(), a.getCity(), a.getLatitude(), a.getLongitude());// вывод данных из массива
        }
        menu();
    }


    


    private static void findNearest() {


    }


    private static void addAirport() {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            System.out.println(" Add a new airport to the list.");
            System.out.print("Enter airport code: ");
            String code = input.nextLine();
            //fw.write(code);
            System.out.print("Enter airport city: ");
            String city = input.nextLine();
            //fw.write(city);
            System.out.print("Enter airport latitude: ");
            String latitude = input.nextLine();
            //fw.write(latitude);
            System.out.print("Enter airport longitude: ");
            String longitude = input.nextLine();
            //fw.write(longitude);
            fw.write("\r" + code + ";" + city + ";" + latitude + ";" + longitude);
            fw.close();
        } catch (IOException ioe) {
            System.out.println("Error writing to file. Person not added.");
        }
    }


    private static double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }


    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double computeDistance() {
        final int R = 6371;
        double lat1 = 0;
        double lat2 = 0;
        double lon1 = 0;
        double lon2 = 0;


        System.out.print("Please enter code of first airport: ");
        String one = input.nextLine();


        for (Airport a : airports) {
            if (one.equals(a.getCode())) {
                lat1 = a.getLatitude();
                lon1 = a.getLongitude();
            }
        }
        System.out.print("Please enter code of second airport: ");
        String two = input.nextLine();


        for (Airport a : airports) {
            if (two.equals(a.getCode())) {
                lat2 = a.getLatitude();
                lon2 = a.getLongitude();
            }


        }


        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        dist = dist * 1.609344;
        System.out.println("Distance is :" + dist + "kilometers");


        return dist;


    }


}