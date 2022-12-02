package OOPS.OOP_1;
class Person {
    int age;
    String name;

    Person () {
        age = 0;
        name = "";
    }

    Person (String name, int age) {
        this.age = age;
        this.name = name;
    }

    void print () {
        System.out.println("Name: " + this.name + " age: " + this.age);
    }
}

public class SwapGame {
    // static void swap (Person tp1, Person tp2) {
    //     Person temp = tp1;
    //     tp1 = tp2;
    //     tp2 = temp;
    // }

    static void swap (Person tp1, Person tp2) {
        tp1 = new Person();
        String tempName = tp1.name;
        tp1.name = tp2.name;
        tp2.name = tempName;

        tp2 = new Person();
        int tempAge = tp1.age;
        tp1.age = tp2.age;
        tp2.age = tempAge;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ritik", 21);
        p1.print();

        Person p2 = new Person("Rockey", 22);
        p2.print();

        swap (p1, p2);

        System.out.println("Swapping done!");

        p1.print();
        p2.print();
    }
}
