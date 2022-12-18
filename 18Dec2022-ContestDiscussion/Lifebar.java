import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int m = Integer.parseInt(inputLine[1]);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            inputLine = br.readLine().trim().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(inputLine[j]);
            }
        }
        int ans = lifeBar(arr, n, m);
        System.out.println(ans);
    }

    public static int lifeBar(int arr[][], int n, int m) {
        // Write your code here
        int maxLifes = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int currLevelLifes = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    currLevelLifes++;
                }
            }
            if (currLevelLifes > maxLifes) {
                maxLifes = currLevelLifes;
                index = i;
            }
        }

        return index;
    }
}