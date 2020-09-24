import java.util.*;
public class Main {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int k = scn.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = scn.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
    }
}

