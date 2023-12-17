package Basic.Functions;
import java.util.Scanner;
public class PrimeNumberBetween1ToN
{
    static int count_prime()
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter till which number you want to calculate ? ");
        n=in.nextInt();
        int i,j,c=0,p=0;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                p++;
            }
            c=0;
        }
        return p;
    }
    public static void main(String args[])
    {
        System.out.println("Total prime number between 1 to 100 : " +count_prime());

    }
}
