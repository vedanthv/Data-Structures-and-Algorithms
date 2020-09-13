import java.util.*;

public class print_all_primes_till_n{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();
    //the outer loop runs from the low number to the high number
    for(int num = low; num <= high; num++){
        int div = 2;int count = 0;
        while(div * div <= num){ //checks for  divisors from 2 to root of num = low
            if(num % div == 0){
                count++;
                break;
            }
            
        }
        
        if(count == 0){
            System.out.println("prime");
        else{
            print("not prime");
        }
    }
 }
}
