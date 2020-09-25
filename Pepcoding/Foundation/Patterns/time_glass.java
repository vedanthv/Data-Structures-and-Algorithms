package Patterns;
import java.util.*;
public class time_glass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sp = 0;
        int n = scn.nextInt();
        int st = n;
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= sp;j++) //print spaces
            {
                System.out.print("\t");
            }
            for(int j = 1;j <= st;j++) //print stars
            {
                if(i > 1 && i <= n/2 && j > 1 && j < st) //this statement selects the first half of the hourglass and j > 1 and j < st ensures that the in the middle spaces are printed and not stars
                {
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }

            }
            if(i <= n/2) //controls the printing in the first and the second half
            {
                sp++;
                st-=2;
            }
            else{
                sp--;
                st+=2;
            }
            System.out.println();
        }

    }
}
