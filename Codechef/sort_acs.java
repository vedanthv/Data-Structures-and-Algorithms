/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<n;i++) System.out.println(a[i]);
	    }catch(Exception e){
	        return;
	    }
	}
}
