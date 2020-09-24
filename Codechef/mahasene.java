/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];
        int k = 0, l = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                k++;

            } else {
                l++;
            }

        }
        if (k > l) {
            System.out.println("READY FOR  BATTLE");
        } else {
            System.out.println("NOT READY");

        }
    }
}