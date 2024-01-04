package Constructor;
import java.util.*;
class aa6
{
    int a,b,c;
    aa6()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b :");
        a=in.nextInt();
        b=in.nextInt();
        disp();
    }
    void disp()
    {
        System.out.println("Value of a : " +a);
        System.out.println("Value of b : " +b);
        c=a+b;
        System.out.println("Sum of two no : " +c);
    }
}
public class abc11
{
    public static void main(String args[])
    {
        aa6 ob = new aa6();
    }
}
