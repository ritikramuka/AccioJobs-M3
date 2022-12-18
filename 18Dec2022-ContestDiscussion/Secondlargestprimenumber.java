import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        int result = secondLargestPrime(arr1);
        System.out.print(result);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int secondLargestPrime(int arr[]) {
        // Write code here
        Arrays.sort(arr);

        int largest = -1;
        int secondLargest = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            if (isPrime(num) == true) {
                if (largest == -1) {
                    largest = num;
                } else if (largest != -1 && num != largest) {
                    secondLargest = num;
                    break;
                }
            }
        }

        return secondLargest;
    }

    // public static int secondLargestPrime(int arr[]) {
    // //Write code here
    // Arrays.sort(arr);

    // ArrayList<Integer> list = new ArrayList();
    // for (int i = arr.length - 1; i >= 0; i--) {
    // int num = arr[i];
    // if (isPrime(num) == true) {
    // list.add(num);
    // }
    // }

    // if (list.size() == 0) {
    // return -1;
    // }

    // ArrayList<Integer> list2 = new ArrayList();
    // for(int i = 0; i < list.size() - 1; i++) {
    // int curr = list.get(i);
    // int next = list.get(i + 1);

    // if (curr != next) {
    // list2.add(curr);
    // }
    // }

    // list2.add(list.get(list.size() - 1));

    // if (list2.size() < 2) {
    // return -1;
    // }

    // return list2.get(1);
    // }
}