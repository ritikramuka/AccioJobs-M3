import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static String largestNumber(final int[] A) {
        String[] arr = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i] + "";
        }

        Arrays.sort(arr, (a, b) -> {
            Long n1 = Long.parseLong(a + b);
            Long n2 = Long.parseLong(b + a);

            if (n1 > n2) {
                return -1;
            } else if (n1 < n2) {
                return 1;
            } else {
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(largestNumber(arr));
    }
}