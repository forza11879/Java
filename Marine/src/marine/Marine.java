package marine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Boat implements Comparable<Boat> {

    public Boat(String name, double grossWeight, double length, int masts) {

        this.name = name;
        this.grossWeight = grossWeight;
        this.length = length;
        this.masts = masts;
    }

    String name;
    double grossWeight;
    double length;
    int masts;

    @Override
    public String toString() {
        return String.format("Boat name is:  %s,  grossweight is:  %.2f,  total length is:  %.2f,  and has %d masts", name, grossWeight, length, masts);
    }

   
    
    @Override
    public int compareTo(Boat b) {
        int result = this.masts - b.masts;
        return result;
    }

    
    
    
}

class SortBoatsByName implements Comparator<Boat> {

    @Override
    public int compare(Boat b1, Boat b2) {
        return b1.name.compareTo(b2.name);
    }

}

class SortByLength implements Comparator<Boat> {

    @Override
    public int compare(Boat o1, Boat o2) {
        double length1 = o1.length;
        double length2 = o2.length;
        if (length1 == length2) {
            return 0;
        }
        if (length1 > length2) {
            return -1;
        } else {
            return 1;
        }
    }
}

class SortByMasts implements Comparator<Boat> {

    @Override
    public int compare(Boat o1, Boat o2) {
        int masts1 = o1.masts;
        int masts2 = o2.masts;
        if (masts1 == masts2) {
            return 0;
        }
        if (masts1 > masts2) {
            return -1;
        } else {
            return 1;
        }
    }
}


class SortByMastsAndGrossWeight implements Comparator<Boat> {


    @Override
    public int compare(Boat o1, Boat o2) {
        int masts1 = o1.masts;
        int masts2 = o2.masts;
        double grossWeight1 = o1.grossWeight;
        double grossWeight2 = o2.grossWeight;
       if (masts1 == masts2)  {
           if (grossWeight1 == grossWeight2) {
                   return 0;
                   }
           if (grossWeight1 > grossWeight2) {
               return -1;
           } else {
               return 1;
           }
         
        }
        if (masts1 > masts2) {
            return 1;
        } else {
            return -1;
        }
    }   
}

class SortByMastsAndWeight implements Comparator<Boat> {

   @Override
   public int compare(Boat l1, Boat l2) {

       int value = l1.masts - l2.masts;
       if (value != 0) {
           return value;
       } else {
           if (l1.grossWeight == l2.grossWeight) {
               return 0;
           }
           if (l1.grossWeight > l2.grossWeight) {
               return 1;
           } else {
               return -1;
           }
       }

   }
}



public class Marine {

    static final String FILE_NAME = "input.txt";
    static ArrayList<Boat> boatList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileInput = new Scanner(new File(FILE_NAME));

        while (fileInput.hasNextLine()) {

            String line = fileInput.nextLine();
            String data[] = line.split(";");
            Boat w = new Boat(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]), Integer.parseInt(data[3]));
            boatList.add(w);

        }

        //1. Read in data from file
        System.out.println("------- original order -------");
        for (Boat w : boatList) {
            System.out.println(w);
        }

        //2. Print all data in natural order by name
        Collections.sort(boatList, new SortBoatsByName());
        System.out.println("------- by Names order --------");
        for (Boat r : boatList) {
            System.out.println(r);
            // System.out.printf("%s %d:%d\n", t.name, t.gamesWon, t.gamesLost);
        }

        //3. Print all data in order by length
        Collections.sort(boatList, new SortByLength());
        System.out.println("------- By Length order --------");
        for (Boat r : boatList) {
            System.out.println(r);
            // System.out.printf("%s %d:%d\n", t.name, t.gamesWon, t.gamesLost);
        }
        
        //4. Print all data in order by masts
        Collections.sort(boatList, new SortByMasts());
        System.out.println("------- By Masts order --------");
        for (Boat r : boatList) {
            System.out.println(r);
            // System.out.printf("%s %d:%d\n", t.name, t.gamesWon, t.gamesLost);
        }
        
        //5. Print all data in order by masts and grossWeight
        Collections.sort(boatList, new SortByMastsAndGrossWeight());
        System.out.println("------- by Masts from lower to higher and grossweight from heaviest to lightest-------");
        for (Boat r : boatList) {
            System.out.println(r);
            // System.out.printf("%s %d:%d\n", t.name, t.gamesWon, t.gamesLost);
        }

        // TODO code application logic here
    }

}
