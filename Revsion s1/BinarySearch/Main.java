import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int BinarySearch (int[] arr, int n, int tar) {
        int si = 0;
        int ei = n - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;

            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scn.nextInt();
        System.out.println("Enter values of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter target to find");
        int tar = scn.nextInt();

        int idx = BinarySearch(arr, n, tar);
        System.out.println("Found at: " + idx);
    }
}
