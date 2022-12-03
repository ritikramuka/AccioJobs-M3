package OOPS.OOP_2;
class Human {
    String name;
    int age;
    String gender;
    boolean isMarried;
    static long population;

    Human() {
        this.name = "unnamed";
        this.age = 0;
        this.gender = "null";
        this.isMarried = false;
        Human.population = 0;
    }

    Human(String name, int age, String gender, boolean isMarried) {
        System.out.println("Added A Human");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        Human.population += 1;
    }

    // not dependent on an object
    static void sayHello() {
        System.out.println("Hello, everyone!");
    }

    // dependent on an object
    void updateDetails (String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
        this.sayBye();
    }

    // dependent on an object
    void sayBye() {
        System.out.println("Bye, everyone!");
        Human.sayHello();
        Human.population += 1;
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.gender + " " + this.isMarried + " population: "
                + Human.population;
    }
}

public class StaticKeyWord {

    public static void main(String[] args) {
        // Human ritik = new Human("Ritik", 21, "Male", false);
        // System.out.println(ritik);

        // Human rahul = new Human("Rahul", 25, "Male", false);

        // System.out.println(ritik);
        // System.out.println(rahul);

        System.out.println(Human.population);
        Human.sayHello();
    }
}
