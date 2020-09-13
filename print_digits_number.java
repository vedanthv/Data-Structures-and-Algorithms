public class print_digits_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = 0; int dig = 0;
        while(temp != 0){
            temp = temp / 10;
            dig++;
        }
        int divisor = (int)Math.pow(10,dig-1); 
        /*logic to set the divisor:
        the divisor has number of zeros equal to the number of digits
        eg: if the number is 754 then the divisor is Math.pow(10,2) which is 100
        Now divide the number by the divisor and print the result.
        Then mod the number by the divisor and divide the divisor by 10*/
        while(divisor != 0)
        {
        /*If we set temp != 0 here then we will miss a case when the number ends with O.
        Here the loop continues till the divisor becomes 0 not the number
        For proper explanation of this refer to the below video:
        https://www.youtube.com/watch?v=gZp776a-pbQ */
        int quotient = n/ divisor;
        System.out.println(quotient);
        n = n % divisor;
        divisor = divisor / 10;
    }
}
}

