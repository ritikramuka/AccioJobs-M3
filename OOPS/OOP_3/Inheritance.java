package OOPS.OOP_3;
// this is not inheritance

// class A {
//     int r = 10;
//     void area () {
//         System.out.println("I'm area ");
//     }
// }

// class B {
//     void fun () {
//         A a = new A();
//         System.out.println(a.r);
//         a.area();
//     }
// }

// ============================================

class Box {
    int length;
    int width;
    int height;

    Box () {
        this.length = 0;
        this.height = 0;
        this.width = 0;
    }

    Box (int length, int width, int height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    Box (int side) {
        this.height = side;
        this.width = side;
        this.length = side;
    }

    Box (Box old) {
        this.height = old.height;
        this.width = old.width;
        this.length = old.length;
    }
}

class BoxWeight extends Box {
    int weight;

    BoxWeight () {
        this.weight = 0;
    }

    BoxWeight (int weight, int length, int width, int height) {
        super(length, width, height);
        this.weight = weight;
    }

    BoxWeight (BoxWeight old) {
        super (old);
        old.weight = weight;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Box b1 = new Box(1, 2, 3);
        // BoxWeight b2 = new BoxWeight(10, 4, 2, 11);

        // System.out.println(b1.length + " " + b1.width + " " + b1.height);
        // System.out.println(b2.weight);
        // System.out.println(b2.height + " " + b2.length + " " + b2.width);

        // Box b3 = new BoxWeight();

        BoxWeight b4 = new BoxWeight(2,3,4,5);
        BoxWeight b5 = new BoxWeight(b4);
    }
}
