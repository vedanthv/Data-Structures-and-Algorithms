/*Watch this video for proper explanation:
https://youtu.be/lKhGlVXdD2c
*/


/*How I would approach the problem 
1. first print the pattern_5(diamond)
2. replace all the stars by 1's
3. replace the 1's by the row-no in which it is present
4. duplicate the second half of the diamond the same as the first half
5. Print each row with continous numbers with the first number of each row with the row-no
6. Print the required patterns
*/
package Patterns;

import java.util.*;

public class pattern_15{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n /2; //space variable is n / 2
        int st = 1; //star variable is 1
        int val = 1; //controls the printing of numbers in line 30
        for(int i = 1;i <= n;i++)//controls the rows
        {
            //for the spaces
            for(int j = 1;j <= sp;j++)
            {
                System.out.print("\t");
            }
            //for the stars
            int cval = val; //cval helps us to acheive the 5 the state
            //cval always starts with the val value from the previous for loop
            for(int j = 1;j <= st;j++)
            {
                System.out.print(cval+ "\t"); 
               // cval++; //helps us to reach the 5th state
                if(j <= st/2) // st controls the printng of the stars
                //if j is less than or equal to the n /2 then increase and print cval otherwise decrease it.
                {
                    cval++;
                }
                else{
                    cval--;
                }
            }   
            //condtions to increment and decreament the spaces and stars
            if(i <= n / 2)
            {
                sp--;
                st+=2;
                val++; //this helps us to acheive state 4
            }
            else{
                sp++;
                st-=2;
                val--; //this helps us to acheive state 4
            }
           // val++; helps us to acheive state 2 and state 3
            System.out.println();
        }
    }
}