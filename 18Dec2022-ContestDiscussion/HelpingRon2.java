import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, q, r;
        p = sc.nextInt();
        q = sc.nextInt();
        r = sc.nextInt();
        int[][] A = new int[p][q];
        int[][] B = new int[q][r];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < r; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] Ans = MatrixMultiplier(A, B);

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(Ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] MatrixMultiplier(int[][] A, int[][] B) {
        // Write your code here
        int p = A.length;
        int q = A[0].length;
        // int q = B.length;
        int r = B[0].length;

        int[][] mul = new int[p][r];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                // System.out.print("C " + i + " " + j + " ");
                // Work for each C one by one
                int myWork = 0;
                for (int k = 0; k < q; k++) {
                    // System.out.print("A " + i + ", " + k + " ");
                    // System.out.print("B " + k + ", " + j + " ");
                    myWork += A[i][k] * B[k][j];
                }
                mul[i][j] = myWork;
                // System.out.println();
            }
            // System.out.println();
        }

        return mul;
    }

}
