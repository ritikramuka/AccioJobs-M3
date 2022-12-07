package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class AL {

    public static void main(String[] args) {
        // // Declare a ArrayList
        // ArrayList<Integer> list = new ArrayList<>(5);

        // // method: add(element) -> add ele in ArrayList at last
        // list.add(1);
        // list.add(2);
        // list.add(4);
        // list.add(5);
        // list.add(6);

        // // Print a ArrayList
        // System.out.println(list);

        // // add at a purticular index
        // // method: add (index, element) -> add ele at a index
        // list.add(2, 3);
        // System.out.println(list);

        // // get any index using -> arr[i] in Array
        // // method: get (index) -> gives ele at that index in ArrayList
        // Integer a = list.get(3);
        // System.out.println("3rd idx Ele: " + a);

        // // set an index to a val -> arr[i] = val in Array
        // // method: set (index, value) -> sets/update ArrayList index to the given value
        // list.set(3, 10);
        // System.out.println(list);

        // // to get length -> arr.lenght in Array
        // // method: size () -> gives the size of ArrayList
        // int myListSize = list.size();
        // System.out.println("Size: " + myListSize);

        // // method: remove (index) -> remove from given index in ArrayList
        // list.remove(3);
        // System.out.println(list);

        // // remove from last
        // list.remove(list.size() - 1);
        // System.out.println(list);


        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(10);
        list2.add(4);
        System.out.println(list2);
        System.out.println(list2.size());

        // Sort a list in ascending order by default
        Collections.sort(list2);
        System.out.println(list2);

        // loop around a ArrayList
        // for loop:
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        // For-Each loop
        for (Integer element : list2) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Hetrogeneous obj in AL
        ArrayList list3 = new ArrayList<>();
        list3.add(2);
        list3.add(3f);
        list3.add("Ritik");
        System.out.println(list3);

        // ternary operator
        // Scanner scn = new Scanner(System.in);
        // int age = scn.nextInt();
        // String a = age > 18 ? "Voter" : "non-voter";
        // System.out.println(a);

        Integer b = -1;
        System.out.println(b);
    }

}