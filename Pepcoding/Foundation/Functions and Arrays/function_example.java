import java.util.*;
public class function_example {
    public static int square(int x)
    {
        int sq = x * x;
        return sq;
    }
    public static void display(int n)
    {
        System.out.println("Th square of "+n+" is "+square(n));
    }
    
public static void main(String[] args)
{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int square = square(n);
    display(n);
}
    
}
