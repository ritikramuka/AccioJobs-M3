
// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {
	static int[] calSum(int a[], int b[], int n, int m) {
		// your code here
		ArrayList<Integer> ans = new ArrayList<>();

		int carry = 0;
		int i = n - 1;
		int j = m - 1;

		while (i >= 0 && j >= 0) {
			int currSum = a[i] + b[j] + carry;
			int rem = currSum % 10;
			carry = currSum / 10;

			ans.add(rem);
			i--;
			j--;
		}

		while (i >= 0) {
			int currSum = a[i] + carry;
			int rem = currSum % 10;
			carry = currSum / 10;

			ans.add(rem);
			i--;
		}

		while (j >= 0) {
			int currSum = b[j] + carry;
			int rem = currSum % 10;
			carry = currSum / 10;

			ans.add(rem);
			j--;
		}

		if (carry > 0) {
			ans.add(carry);
		}

		Collections.reverse(ans);

		int[] sol = new int[ans.size()];
		for (int k = 0; k < ans.size(); k++) {
			sol[k] = ans.get(k);
		}

		return sol;
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++)
			arr1[i] = sc.nextInt();

		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++)
			arr2[i] = sc.nextInt();
		sc.close();

		int[] res = calSum(arr1, arr2, n1, n2);
		for (int i : res)
			System.out.println(i);
	}
}