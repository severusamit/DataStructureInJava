package Basic.Loop;
import java.util.Scanner;
//Problem Statement 1+4=9+16+25+............+n
public class DoWhileSumofSquares
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,sum=0,i;
        System.out.println("Enter term ?");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
            System.out.print(i * i + " + " );
            sum=sum +i*i;
        }
        System.out.println("\b = " +sum);
    }
}
