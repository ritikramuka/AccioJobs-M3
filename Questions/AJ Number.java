import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());
        
        solve(str,n);

        input.close();
    }

	static boolean isAjnum(long num)
	{
		if (num == 0 || num == 1) 
		{
			return false;
		}

		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for (int ele : arr) 
		{
			if (ele == num)
			{
				return true;
			}
		}

		for (int ele : arr) 
		{
			if (num % ele == 0) 
			{
				return false;
			}	
		}

		return true;
	}

	static boolean isValid (int start, int end, boolean[] vis)
	{
		for (int i = start; i < end; i++)
		{
			if(vis[i] == true) 
			{
				return false;
			}
		}

		return true;
	}
	
    public static void solve(StringBuilder sb,int n){
        // WRITE YOUR CODE HERE
		boolean[] vis = new boolean[n];

		int cnt = 0;
		for (int len = 1; len <= n; len++)
		{
			for (int j = 0; j + len <= n; j++) 
			{
				String str = sb.substring(j, j + len);
				if (isAjnum(Long.parseLong(str)) == true && isValid(j, j + len, vis) == true) {
					cnt++;

					for (int i = j; i < j + len; i++)
					{
						vis[i] = true;
					}
				}
			}
		}

		System.out.println(cnt);
    }
}