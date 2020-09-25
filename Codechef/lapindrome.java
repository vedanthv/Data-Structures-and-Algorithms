/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	// Sort a string
	static String sortString(String str){
        char [] arr = str.toCharArray();
        Arrays.sort(arr);	
        return new String(arr);
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		while(testcases > 0){
			
			String input = sc.next();
			String firsthalf, remhalf;
			int inputlength = input.length();
			int inputmid = inputlength / 2;
			
			// If Even Length
			if(inputlength % 2 == 0){
				firsthalf = input.substring(0, inputmid);
				remhalf = input.substring(inputmid, inputlength);
			}else{
				// If Odd Length
				firsthalf = input.substring(0, inputmid);
				remhalf = input.substring(inputmid + 1, inputlength);
			}
			
			// Sort the two halfs
			firsthalf = sortString(firsthalf);
			remhalf = sortString(remhalf);
			
			if(firsthalf.equals(remhalf)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
			testcases--;
		}
		
	}

}
