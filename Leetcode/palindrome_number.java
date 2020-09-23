package Patterns;
import java.util.*;
public class palindrome_number{  
    public static void main(String args[]){  
        int n = scn.nextInt();
     int r,sum=0,temp;      
     temp=n;    
     while(n>0){    
      r=n%10;  //getting remainder  
      sum=(sum*10)+r;    
      n=n/10;    
     }    
     if(temp==sum)    
      System.out.println("palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
   }  