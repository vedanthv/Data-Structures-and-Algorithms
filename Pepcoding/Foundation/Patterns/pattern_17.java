package Patterns;
import java.util.*;
public class pattern_17 
{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sp = n / 2; //always there are n/2 spaces
    int st = 1;
    for(int i = 1;i <= n;i++)
    {
        for(int j=1;j<=sp;j++)
        {
            if(i == n/2+1) //middle row we want star not space
            {
                System.out.print("*\t");
            }
            else{
            System.out.print("\t");
            }
        }
        for(int j=1;j<=st;j++)
        {
            System.out.print("*\t");
        }

        if(i <= n / 2)
        {
            st++;
        }
        else{
            st--;

        }
        System.out.println();
    }
        
}
}
