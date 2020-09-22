package Patterns;

import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){//job of loop is to provide uniques values of row numbers to the inner loop
            for(int j=1;j<=i;j++){ //job is to print the stars equal to the row number i
                System.out.print("*\t");
            }
            System.out.println(); //once it completes the inner loop this line shifts cursor to the next row
        }

        
    
}
}
