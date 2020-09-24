package Patterns;
import java.util.*;
public class pattern_10 {
    public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int os = n / 2; //outer space
    int is = -1;    //innter space
    //why is inner space is -1?---->watch the video explanation on pepcoding
    //https://www.youtube.com/watch?v=8ccsrxrXCmk

    for(int i = 1; i <= n;i++)
    {
        for(int j=1;j <= os;j++)
         //printing the outer space
         {
             System.out.print("\t");
         }
         //printing the stars
         System.out.print("*\t");
        
         //printing the inner spaces
         for(int j=1;j<=is;j++)
         {
            System.out.print("\t");
         }
         //since we dont want to print two stars in the first and last row we execute another if statement ehoch excludes the first row and the last row
         if(i > 1 && i < n){
             System.out.print("*\t");
         }
         //now we write code for the increment and decrement of the is,os and the stars
        //this is a similar logic to the previous patterns
         if(i <= n / 2)
         {
             os--;
             is+=2;
         }
         else
         {
             os++;
             is-=2;
         }
         System.out.println();
    }

}
}


