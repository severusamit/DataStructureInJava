package Basic.Loop;
import java.util.*;
public class WhileLoopSpyNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,d,sum=0,pro=1;
        System.out.println("enter any no ?");
        n=in.nextInt();
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            pro=pro*d;
            n=n/10;
        }
        if(sum==pro)
        {
            System.out.println("Given Number is spy Number");
        }
        else {
            System.out.println("Not a Spy Number");
        }
    }
}
