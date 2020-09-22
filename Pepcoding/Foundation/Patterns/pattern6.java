package Patterns;

import java.util.*;
public class pattern6 {
    /*There are three parts to this pattern:
    1. Printing the first batch of stars
    2. Print the spaces
    3. Print the second batch of stars*/
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int st = n/2+1; //if 5 is the number of rows then in the first row there are 2+1=3 stars in the start
            int sp = 1; //in the first row there is 1 space in the middle
            for(int i=1; i<=n;i++){ //to control the rows
              for(int j=1;j<=st;j++) //to print the first part of the stars
              {
                  System.out.print("*\t");
              }
              for(int j=1;j<=sp;j++){ //to print the spaces(2nd part)
                 System.out.print("\t");
              }
              for(int j=1;j<=st;j++){ //to print the stars(3rd part)
                  System.out.print("*\t");
              }
              if(i <=n/2)
              {
                  sp+=2;
                  st--;
              } else{
                  sp-=2;
                  st++;
              }
              System.out.println();
            }
        }

    
}
