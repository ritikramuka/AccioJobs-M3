import java.io.*;
import java.util.*;

public class Main {

    public static int searchInsert(int[] arr, int tar) {
        // Write code here
        int n = arr.length;
        int pos = n;
        int si = 0;
        int ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                pos = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return pos;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(searchInsert(A, B));
    }
}