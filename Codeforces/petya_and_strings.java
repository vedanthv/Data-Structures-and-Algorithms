import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.nextLine(), second = in.nextLine();
		String firstUpdated = first.toLowerCase(), secondUpdated = second.toLowerCase();
		int value = 0;
		for (int i = 0; i < firstUpdated.length(); i++) 
			if (firstUpdated.charAt(i) == secondUpdated.charAt(i)) //if same continue
				continue;
			else if (firstUpdated.charAt(i) < secondUpdated.charAt(i)) {
				value = -1;
				break;
			} else {
				value = 1;
				break;
			}
		System.out.println(value);
		in.close();

	}

}
