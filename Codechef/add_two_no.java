import java.util.*;
import java.io.InputStream;
public class Main {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		Scanner scn = new Scanner(System.in);

		// Read the number of test casese.		
		int T = scn.nextInt();
		while (T > 0) {
			// Read the numbers a and b.
			int a = scn.nextInt();
			int b = scn.nextInt();
			
			// Compute the sum of a and b.
			int ans = a + b;
			System.out.println(ans);
		}
    }
}


