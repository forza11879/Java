//manypeopleteacher
//ManyPeopleTeacher
package manypeopleteacher;

import java.util.ArrayList;
import java.util.Scanner;

class Person {

//     Person() { }
    
    Person(String n, int a) {
        this.setName(n);
        this.setAge(a);
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (age < 1 || age > 150) {
            throw new IllegalArgumentException("Age must be between 1-150");
        }
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("Person: %s, %d y/o", getName(), getAge());
    }
    
    public void print() {
        System.out.printf("Person: %s, %d y/o\n", getName(), getAge());
    }
}

class Student extends Person {

    Student(String name, int age, String program, double GPA) {
        super(name, age);
        setProgram(program);
        setGPA(GPA);
    }
  
    private String program;
    private double GPA;

    public String getProgram() {
        return program;
    }

    public final void setProgram(String program) {
        if (program == null || program.length() < 1) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        this.program = program;
    }

    public double getGPA() {
        return GPA;
    }

    public final void setGPA(double GPA) {
        if (GPA < 1.0 || GPA > 4.3) {
            throw new IllegalArgumentException("GPA must be between 1.0 and 4.3");
        }
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, %d y/o in %s gpa %.2f",
                getName(), getAge(), getProgram(), getGPA());
    }

    @Override
    public void print() {
        System.out.printf("Student: %s, %d y/o in %s gpa %.2f\n",
                getName(), getAge(), getProgram(), getGPA());
    }
    
}

final class Teacher extends Person {

    Teacher(String name, int age, String subject, int yoe) {
        super(name, age);
        setSubject(subject);
        setYoe(yoe);
    }
    
    private String subject;
    private int yoe;

    public String getSubject() {
        return subject;
    }

    public final void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYoe() {
        return yoe;
    }

    public final void setYoe(int yoe) {
        this.yoe = yoe;
    }

    @Override
    public String toString() {
        return String.format("Teacher: %s, %d y/o teaching %s since %d years",
                getName(), getAge(), getSubject(), getYoe());
    }
    
    @Override
    public void print() {
        System.out.printf("Teacher: %s, %d y/o teaching %s since %d years\n",
                getName(), getAge(), getSubject(), getYoe());
    }
}

/*
class UnivTeacher extends Teacher {
    
    public UnivTeacher(String name, int age, String subject, int yoe) {
        super(name, age, subject, yoe);
    }
    
}*/

public class ManyPeopleTeacher {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Person> people = new ArrayList<>();

    // JUnit - automated testing framework
    public static void main(String[] args) {
        // Person p0 = new Person();
        Person p1 = new Person("Jerry", 33);
        Student s1 = new Student("Maria", 22, "Math", 4.2);
        Teacher t1 = new Teacher("Terry", 44, "PhyEd", 20);
        String sss = "Abc";
        // people.add(p0);
        people.add(p1);
        people.add(s1);
        people.add(t1);

        //
        for (Person p : people) {
            // if-else chain, similar to switch-case
            if (p instanceof Student) {
                Student s = (Student) p;
                System.out.printf("Student: %s, %d y/o in %s gpa %.2f\n",
                        s.getName(), s.getAge(), s.getProgram(), s.getGPA());
            } else if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                System.out.printf("Teacher: %s, %d y/o teaching %s since %d years\n",
                        t.getName(), t.getAge(), t.getSubject(), t.getYoe());
            } else if (p instanceof Person) {
                System.out.printf("Person: %s, %d y/o\n", p.getName(), p.getAge());
            } else { // default
                System.out.println("1-800-WEMESSEDUP");
            }
        }
        //
        for (Person p : people) {
            System.out.println(p);
        }
        //
        for (Person p : people) {
            p.print();
        }

    }

}