package OOPS.OOP_1;
class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber () {
        this.real = 0;
        this.imaginary = 0;
    }

    ComplexNumber (int real, int imaginary) {
        // real = this.real;

        this.real = real;
        this.imaginary = imaginary;
    }

    void print () {
        System.out.println(this);

        if (this.imaginary >= 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else {
            System.out.println(this.real + " " + this.imaginary + "i");
        }
    }

    ComplexNumber add (ComplexNumber cn) {
        // System.out.println(real + " + " + imaginary + "i");
        // System.out.println(cn.real + " + " + cn.imaginary + "i");

        int addedRealPart = this.real + cn.real;
        int addedImaginaryPart = this.imaginary + cn.imaginary;
        ComplexNumber addedCN = new ComplexNumber(addedRealPart, addedImaginaryPart);

        return addedCN;
    }

    ComplexNumber subtract (ComplexNumber cn) {
        int subtractedRealPart = this.real - cn.real;
        int subtractedImaginaryPart = this.imaginary - cn.imaginary;

        ComplexNumber subCN = new ComplexNumber(subtractedRealPart, subtractedImaginaryPart);

        return subCN;
    }
}

public class Excercise1 {
    public static void main(String[] args) {
        // ComplexNumber cn1 = new ComplexNumber(7, 5);
        // cn1.print();

        // ComplexNumber cn2 = new ComplexNumber(4, 2);
        // cn2.print();

        // // cn3 = cn1 + cn2
        // ComplexNumber cn3 = cn1.add(cn2);
        // cn3.print();

        // // cn4 = cn1 - cn2
        // ComplexNumber cn4 = cn1.subtract(cn2);
        // cn4.print();

        // // cn5 = cn2 - cn1
        // ComplexNumber cn5 = cn2.subtract(cn1);
        // cn5.print();

        // ComplexNumber cn6 = new ComplexNumber(4, 5);

        // ComplexNumber cn7 = new ComplexNumber(6, 10);

        // cn6.print();
        // cn7.print();
    }
}
