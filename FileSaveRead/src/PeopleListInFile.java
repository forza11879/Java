/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ipd
 */
public class PeopleListInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (;;) {
            try {
                System.out.println("What do you want to do?");
                System.out.println("1. Add person information.");
                System.out.println("2. List Persons info");
                System.out.println("3. Find a person by name");
                System.out.println("4. Fibd all persons younger then age");
                System.out.println("0. Exit");
                System.out.println("Choice: ");

                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                if (choice < 0 || choice > 4) {
                    System.out.println("Wrong choice, try again.");
                    continue;
                }
                switch (choice) {
                    case 1: {
                        append();
                        break;
                    }
                    case 2:
                        list();
                        break;
                    case 3:
                        find();
                        break;
                    case 4:
                        younger();
                        break;
                    case 0:
                        return;
                }
            } catch (IOException e) {
            }
        }
    }

    static void append() throws IOException {
        try{
        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("people.txt", true)));
        System.out.println("Name: ");
        out.println(input.nextLine());
        System.out.println("age: ");
        out.println(input.nextLine());
        System.out.println("city: ");
        out.println(input.nextLine());
        out.close();
        }
        catch(IOException ex){
        ex.printStackTrace();
        }
    }

    static void list() throws IOException {

        BufferedReader out = new BufferedReader(new FileReader("people.txt"));
        String line = "";
        
        while ((line = out.readLine()) != null) {
            System.out.println(line+" is "+out.readLine()+" from "+out.readLine());
        }

    }

static void find() throws IOException {

        BufferedReader out = new BufferedReader(new FileReader("people.txt"));
        Scanner input=new Scanner (System.in);
        String subStr = "",line="";
        System.out.print("Please enter partial name: ");
        subStr=input.nextLine();
        
        while ((line = out.readLine()) != null) {
            if(line.toLowerCase().contains(subStr.toLowerCase())){
            System.out.println("Matches found :");
            System.out.println(line+" is "+out.readLine()+" from "+out.readLine());
            }
        }

    }

static void younger() throws IOException {

        BufferedReader out = new BufferedReader(new FileReader("people.txt"));
        Scanner input=new Scanner (System.in);
        String city="",age = "",name="";
        System.out.print("Enter maximum age: ");
        int agein=input.nextInt();
        
        while ((name = out.readLine()) != null) {
            age=out.readLine();
            city=out.readLine();
            if(agein>Integer.parseInt(age)){
            System.out.println("Matches found :");
            System.out.println(name+" is "+age+" from "+city);
            }
        }

}
    
}
