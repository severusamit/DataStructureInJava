package Basic.Functions;
import java.util.Scanner;
public class RecursionFactorial
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,f;
        System.out.println("Enter any number  ?");
        n=in.nextInt();
        f=fact(n);
        System.out.println("Factorial Number of   " + n + " is " +f);
    }
    static int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
