/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fd,ld;
        int dig = 0;
        ld = n % 10;
        while(n != 0)
        {
            dig = n % 10;
            n = n / 10;
        }
        fd = dig;
        System.out.println(fd+ld);
	}
}
