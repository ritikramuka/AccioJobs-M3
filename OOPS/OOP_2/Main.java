package OOPS.OOP_2;
import java.util.Scanner;

class Students {
    int rollNo;
    int age;
    String name;
    int attendance;
    String gender;

    Students() {
        this.rollNo = 0;
        this.name = "unknown";
        this.attendance = 0;
    }

    Students (int rollNo, int attendance, String name) {
        this(rollNo, attendance);
        this.rollNo = 99;
        this.attendance = 100;
        this.name = name;
    }

    Students (int rollNo, int attendance) {
        this.rollNo = rollNo;
        this.attendance = attendance;
    }

    // copy constructor
    Students (Students s) {
        this.rollNo = s.rollNo;
        this.attendance = s.attendance;
        this.name = s.name;
    }

    Students setValues () {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Name: ");
        this.name = scn.next();
        System.out.println("RollNo: ");
        this.rollNo = scn.nextInt();
        System.out.println("Attendance: ");
        this.attendance = scn.nextInt();

        return this;
    }

    void print () {
        System.out.println(this.name + " " + this.rollNo + " " + this.attendance);
    }

    // Method overloading
    // void func(int num) {
    //     this.attendance += 1;
    // }

    // void func(String gender) {
    //     this.gender = gender;
    // }

    // int func (String name, int rollNo) {
    //     return this.attendance;
    // }
}

public class Main {
    public static void main(String[] args) {
        // Students s1 = new Students(4, 55, "Rockey");
        // Students s2 = s1;

        // Students s1 = new Students(4, 55, "Rockey");
        // Students s2 = new Students(s1);

        // s1.print();
        // s2.print();

        // s1.name = "Ritik";

        // s1.print();
        // s2.print();

        Students s1 = new Students();
        Students s2 = s1.setValues();
        s2.print();
    }
}
