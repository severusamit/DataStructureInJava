package Basic.Loop;
import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,c=0,i;
        System.out.println("Enter number ?");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("No is not prime");
        }
    }
}
