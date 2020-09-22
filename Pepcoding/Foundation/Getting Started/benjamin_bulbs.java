import java.util.*;
/*In this problem, first all the bulbs are turned off and then when they are toggled
  they are turned on given the condition that in the first iteration only the first bulb is toggled and in the 2nd iteration every second bulb is toggled and for every nth iteration every nth bulb is toggled. 
  On performing the dry run we see that only the bulbs wich are perfect squares remain switched on because perfect squares always have odd number of factors and since the bulbs were in the off state at the beginning in every odd state the bulb is on.
  For detailed explanation watch this video: https://www.youtube.com/watch?v=7IbWTFOUP1U*/
public class benjamin_bulbs{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i * i < n; i++)
        {
            System.out.println(i*i); 
        }
    }
}