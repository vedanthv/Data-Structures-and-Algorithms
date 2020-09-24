import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        short T = sc.nextShort();
        {
            for (short i = 0; i < T; i++) {
                int a = sc.nextInt();
                int n = a;
                int s = 0;
                while (n != 0) {
                    s += (n % 10);
                    n /= 10;
                }
                System.out.println(s);
            }
        }

    }
}
