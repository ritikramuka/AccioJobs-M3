package OOPS.OOP_3;
// final class SecretsPass {
//     String AccioPortalPass;
//     String InstaPass;
// }

// class StealPass extends SecretsPass {

// }

class Fruits {
    String color;

    final void getSweetRatio() {
        System.out.println("I give sweetness ratio, i.e sweetness / fruit name size");
    }

    int getSweetRatio(int sweetness, int size) {
        return sweetness / size;
    }

}

class Apple extends Fruits {
    String color;
    int sweetness = 10;

    // @Override
    // void getSweetRatio() {
    //     System.out.println("sweetness is " + sweetness / 5);
    // }
}

class Banana extends Fruits {
    String color;
    int sweetness = 20;

    // @Override
    // void getSweetRatio() {
    //     System.out.println("sweetness is " + sweetness / 6);
    // }
}

public class Polymorphism {

    final static class A {
        static void fun () {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Fruits f = new Fruits();
        Apple a = new Apple();
        Banana b = new Banana();

        f.getSweetRatio();
        a.getSweetRatio();
        b.getSweetRatio();

        A.fun();
    }
}
