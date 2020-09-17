import java.util.*;
public class prime_factorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int div=2;div*div <= n;div++){ //loop checks for prime factors
            //we execute only till the time where i <=sqrt(n)
         while(n%div==0){
             System.out.print(div+" ");
             n = n/div; //if the number is 36 then the first prime factor is 2 and then we divide 36 by this fator. this logic is used here
         }

        }
        if(n != 1)
        {
            System.out.println(n);//if the last prime factor is is itself a prime number then we print the prime number
            //it is the only divisor that is greater than the square root of number
        } 
    }
}
