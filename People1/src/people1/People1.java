package people1;

import java.util.ArrayList;
import java.util.Scanner;

class Person {

    Person(String n, int a) {
        name = n;
        age = a;
    }
    String name;
    int age;
}

public class People1 {
    
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        
        people.add(new Person("Jerry", 33));
        people.add(new Person("Maria", 44));
        people.add(new Person("Timmy", 55));
        
        System.out.printf("p[0]: name=%s, age=%d\n",
                people.get(0).name, people.get(0).age);
        System.out.printf("p[1]: name=%s, age=%d\n",
                people.get(1).name, people.get(1).age);
        System.out.printf("p[2]: name=%s, age=%d\n",
                people.get(2).name, people.get(2).age);
        
        for (int i=0; i<people.size(); i++) {
            Person p = people.get(i);
            System.out.printf("p[%d]: name=%s, age=%d\n",
               i, p.name, p.age);
        }
        
        for (Person p : people) {
            System.out.printf("p: name=%s, age=%d\n",
               p.name, p.age);
        }
        
    }

}