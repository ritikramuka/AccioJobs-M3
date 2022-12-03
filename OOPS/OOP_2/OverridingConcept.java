package OOPS.OOP_2;
class Accio {
    int rollNum;
    String name;

    Accio (String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }

    Accio () {
        this.name = "";
        this.rollNum = 0;
    }

    // overriding toString method
    public String toString() {
        return this.name + " " + this.rollNum;
    }
}

public class OverridingConcept {
    public static void main(String[] args) {
        Accio obj = new Accio("Ritik", 21);
        System.out.println(obj);
    }
}
