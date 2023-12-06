package Basic;
import java.util.*;
public class AndOperatorMaximumNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter three different number ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Max number : "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Max number  : "+b);
        }
        else {
            System.out.println("max number :"+c);
        }
    }
}
