import java.util.*;

public class gcd_and_lcm {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        /* GCD is the biggest number that divides both the numbers */

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int tnum1 = num1; // temp var to store the num1 to calculate the lcm
        int tnum2 = num2; // temo variable to store the num2 to calculate the lcm

        while(tnum1 % tnum2 != 0){ //until the remainder does not become 0
            int rem = tnum1 % tnum2; //tnum1 is the dividend and tnum2 is the divisor
            tnum1 = tnum2; //the divisor in previous iteration becomes the dividend in the next iteration
            tnum2 = rem; //The remainder in the previous iteration becomes the divisor in the next iteration
        }
            //gcd now becomes the divisor(tnum2) when the remainder becomes 0
            int gcd = tnum2; 

            //to find the lcm
            int lcm = (num1 * num2)/gcd; //basic formula

            System.out.println(gcd);
            System.out.println(lcm);
    }

}
