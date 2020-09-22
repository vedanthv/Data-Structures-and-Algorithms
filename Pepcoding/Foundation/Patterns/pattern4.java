package Patterns;

import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sp = 0; //no spaces in first row
    int st = n; //all stars in first row

    for(int i = 1; i <= n;i++)
    {
            for(int j=1;j<=sp;j++) //to print spaces
            {
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++) //to print the stars
            {
                System.out.print("*\t");
            }
            System.out.println(); //now to the next row
            sp++; //increase the number of spaces 
            st--; //decrease the number of stars
        //start the next interation of the outermost loop
    }

}
}

