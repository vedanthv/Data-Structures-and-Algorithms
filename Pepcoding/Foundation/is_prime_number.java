import java.util.*;
  
  public class is_prime_number{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      
      for(int i = 0; i < t; i++){
          int n = scn.nextInt();//take input
          /*Logic: Watch this video:
            https://www.youtube.com/watch?v=HXSfAyjWM8A&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=12 */
          int div = 2;
          while(div * div <= n){ //checks only till sqrt(number)
              if(n % div == 0){
                  break;   //if the divisor divides the number within the root of the number then it is not prime number
                //if there is no number that divides the given numbeer within the root of that number then there are only two divisors
                //that are 1 and the number itself/
               // for any given number the unique factors are already seen before sqrt(n)
              }
              div++;
          }
          
          if(div * div > n){
              System.out.println("prime");
          } else {
              System.out.println("not prime");
          }
      }
  
   }
  }
