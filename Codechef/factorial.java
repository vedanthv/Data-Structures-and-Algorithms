/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    BigInteger fact=new BigInteger("1");
		    if(a[i]==0){
		    System.out.println(fact);
		    continue;
		    }
		    else if(a[i]>=1)
		    {
		        while(a[i]!=0)
		        {
		             fact = fact.multiply(BigInteger.valueOf(a[i]));
		            a[i]--;
		        }
		    }
		    System.out.println(fact);
		}
	}
}