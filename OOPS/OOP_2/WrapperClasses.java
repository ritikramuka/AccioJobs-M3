package OOPS.OOP_2;
public class WrapperClasses {

    public static void main(String[] args) {
        // converstion on a premitive datatype to a wrapper class 
        // known as: Wrapping / Boxing
        // Integer a = new Integer(10);
        // System.out.println(a);

        // converstion on a wrapper class to premitive datatype
        // known as: unrapping / unboxing
        // int b = a.intValue();
        // System.out.println(b);

        
        // after Java v.5
        
        // converstion on a premitive datatype to a wrapper class automatically
        // known as: Auto-boxing
        Integer c = 4;
        System.out.println(c);

        // converstion on a wrapper class to premitive datatype
        // known as: auto-unboxing
        int d = c;
        System.out.println(d);
    }
}
