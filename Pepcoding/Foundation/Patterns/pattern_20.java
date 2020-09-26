package Patterns;
import java.util.*;
public class pattern_20{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) { //first and the last columns will have all stars
                    System.out.print("*\t");
                } else if (i > n / 2 && (i == j || i + j == n + 1)) { //the condition in the paranthesis allows to choose only one of the diagonals(either the normal diagonal or the anti-diagonal) in the second half of the W.
                    System.out.print("*\t");
                } else {//otherwise print space
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

    }
}