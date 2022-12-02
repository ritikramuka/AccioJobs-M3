package OOPS.OOP_1;
class Car {
    // Data Member
    String modelName;
    String color;
    int price;

    // constructor

    // default constructor
    Car () {
        System.out.println("I'm a constructor");
        modelName = "Not Specified";
        color = "Not Specified";
        price = 0;
    }

    // parameterised constructor
    Car (String givenModelName, String givenColor, int givenPrice) {
        System.out.println("This is a parametarised constructor");
        modelName = givenModelName;
        color = givenColor;
        price = givenPrice;
    }

    Car (String givenModelName, String givenColor) {
        System.out.println("This is a parametarised constructor 2");
        modelName = givenModelName;
        color = givenColor;
        price = 600000;
    }

    // Class Methods
    void drive () {
        System.out.println("car is running");
    }

    void lock () {
        System.out.println("the car is locked");
    }

    void unlock () {
        System.out.println("the car is unlocked");
    }

    // setter
    void setPrice (int np) {
        if (np < 0) {
            return;
        } 

        price = np;
    }

    // getter
    float getPrice() {
        return price;
    }
}


class Main {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.color = "Red";
        // c1.price = 100000;
        // c1.modelName = "Automatic";
        // c1.drive();
        // System.out.println(c1.color + " " + c1.price + " " + c1.modelName);

        // Car c2 = new Car();
        // c2.color = "Black";
        // c2.price = 50000;
        // c2.modelName = "manual";
        // c2.unlock();
        // System.out.println(c2.color + " " + c2.price + " " + c2.modelName);

        // Car c3 = new Car();
        // c3.lock();
        // System.out.println(c3.color + " " + c3.price + " " + c3.modelName);

        Car c4 = new Car();
        System.out.println(c4.price);

        Car c5 = new Car("automatic", "red", 500000);
        System.out.println(c5.price);

        Car c6 = new Car ("manual", "Blue");
        System.out.println(c6.color + " " + c6.modelName + " " + c6.price);
    }
}