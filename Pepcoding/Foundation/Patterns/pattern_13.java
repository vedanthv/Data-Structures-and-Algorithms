//note: this is a very complex problem
//do watch this video before understanding the code below
//https://www.youtube.com/watch?v=8Cyb3X5j1Rw
package Patterns;
import java.util.*;
public class pattern_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0;i < n;i++) 
        //why i is 0. because we have to print nC0 also.
        {
            int icj = 1; //this is the first number to be printed in the series
            for(int j = 0;j <= i;j++) //in each row we hae to print stars  = no of rows + 1
            {
                System.out.print(icj + '\t');
                int icjp1 = icj * (i -j) / (j+1); //this is the next value in the series iCj+1 which is obtained from the previous value itself.    
                //now we store the new value in icj and increment the loop
                icj = icjp1;
            }
            System.out.println();

        }
    }
    
}
