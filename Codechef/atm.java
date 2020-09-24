    import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        double balance = in.nextDouble();
        if(amount%5==0 && amount + 0.50 <= balance)
        balance -= amount + 0.50;
        
        System.out.println(String.format("%.2f", balance));
    }
    }
