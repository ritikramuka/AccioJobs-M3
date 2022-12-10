import java.util.*;

class Solution {
    public void printMultiplication(int[][] a, int[][] b, int n) {
        // Write code here and print output

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // System.out.println("Work here for C " + row + " ," + col);
                int work = 0;

                // do work for me C [row][col]
                for (int k = 0; k < n; k++) {
                    // System.out.println("A ->" + row + " " + k + " " + "B ->" + k + " " + col);
                    work += a[row][k] * b[k][col];
                }
                // completed my work

                System.out.print(work + " ");
            }
            System.out.println();
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int[][] matrix1 = new int[n][n];
            int[][] matrix2 = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix1[i][j] = sc.nextInt();

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix2[i][j] = sc.nextInt();

            Solution Obj = new Solution();
            Obj.printMultiplication(matrix1, matrix2, n);
        }
        sc.close();
    }
}
