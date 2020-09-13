import java.util.*;
   
public class rotate{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt(); //the input number
  int k = scn.nextInt(); //the no of rotations
  int dig = 0;
  //first find the number of digits
  int temp = n;
  while(temp != 0)
  {
      temp = temp / 10;
      dig++;
      
  }
  k = k % dig;
  /*if the number of rotations is 352 times on a number
  and the number is a five digit number we get the same number on 
  rotating every five times. So until 350(5*70) we get the same number
  then we rotate only two times*/
  
  //if k < 0
  if(k < 0)
  {
      k = k+ dig;
      /*if the no of digits is 5 and the k is -2,
      rotating the number k+mod times is the same s rotating k times
      in this case rotating 5-2 times is same as rotating -2 times*/
  }
  int div = 1;//divisor
  int multi = 1;//multiplier
  //now we have to find the div and multiplier
  for(int i=1;i<=dig;i++){
      if(i<=k){
          div = div * 10; 
          /*we have to se the divisor with the same
          no of zeros as present in the number*/
          }else{
              multi = multi * 10; 
              //from k to dig iteration the 
              //multiplier gets multiplied
          }
          
  }
  int q = n / div; //the quotient
  int r = n % div; //the remainder
  r = r * multi + q;
}
}


