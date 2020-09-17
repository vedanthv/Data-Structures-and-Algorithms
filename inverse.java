import java.util.*;

public class inverse {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int inv = 0; // inverted number
        int op = 1; // op is original place(it is the counter that runs throught the number off
                    // digits)
        while (n != 0) {
            int od = n % 10; // od is the original digit
            int id = op; // id is the inverted digit
            int ip = od; // ip is the inverted position
            /* invert the digit and the position */

            // make the inverse using the logic--> id+10^(digit * inverted_place-1)
            inv = inv + id *(int) Math.pow(10, ip - 1);    
            // and then divide the no by 10
            // now increase the original place as this acts as out counter
            n = n / 10;
            op++;
        }
        System.out.println(inv);
    }
}
