package Basic.Loop;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num,n,rev=0,d;
        System.out.println("enter eny number ? ");
        num =in.nextInt();
        n=num;      //copy
        while(n>0)
        {
            d=n%10;
            rev = rev*10+d;
            n/=10;
        }
        if(num==rev)
        {
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("No is not Palindrome");
        }
    }
}
