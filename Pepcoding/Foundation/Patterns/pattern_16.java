package Patterns;
import java.util.*;
public class pattern_16 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sp = 2 * n - 3; 
    int st = 1;
    
    /*Total number of columns is 2n - 1 and in the first row there are two stars already occupied so the total numbber of spaces is 2*n-3 */
    for(int i=1;i<=n;i++)//row counter
    {
        int val = 1;
        for(int j = 1;j <= st;j++)
        {
            System.out.print(val + "\t");
            val++;
        }
        for(int j=1;j <= sp;j++)
        {
            System.out.print("\t");
        }
        if(i == n)
        {
            st--; //to take care that one extra star is not printed on th e last row
            val--; //the last row of the second half has two numbers less than the last row of the firstt half
        }
        for(int j = 1;j  <= st;j++)
        {
            val--;
            System.out.print(val + "\t");   
        }
    st++;
    sp-=2;
    val++;
    System.out.println();
    }
    
}
   
}

