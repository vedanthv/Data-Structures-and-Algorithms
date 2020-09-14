import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ //this is row wise operation:the number of stars depends on the row no
                System.out.print("*\t");
            }
            System.out.println(); //once it completes the inner loop this line shifts cursor to the next row
        }

        
    
}
}
