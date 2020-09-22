import java.util.*;

public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // to fint the largest side logic
        int max = a;
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }

        if (max == a) {
            System.out.println((b * b + c * c) == (a * a));
        } else if (max == b) {
            System.out.println((b * b + c * c) == (a * a));
        } else {
            System.out.println((a * a + b * b) == (c * c));
        }

    }
}
