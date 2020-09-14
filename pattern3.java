import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt(); //no of stars eg:5

        int sp = n-1;     //no of spaces: 5-1
        int st = 1;        //no of stars for 1st iteration:1 always

        for(int i=1;i<=n;i++)
        { //runs as many times as  n
            for(int j=1;j<=sp;j++)
            { //prints spaces as times as the value of sp which keeps decreasing
                System.out.print("\t");
            }

            for(int j=1;j<=st;j++)
            { //prints stars as times as the value of st which keeps increasing and give tabs in the end of each iteration
                System.out.print("*\t");
            }
            sp--; //decrease npaces by 1
            st++;   //increase st by 1
            System.out.println();
        }
    }
}


