package Basic.Functions;
import java.util.Scanner;
public class ValueCall
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a and b ?");
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Value of a before function :" +a);
        System.out.println("Value of b before function :" +b);
        disp5(a,b);
        System.out.println("Value of a after function call : "+a);
        System.out.println("Value of b after function call : "+b);
    }
    static void disp5(int a,int b)
    {
        a=a+10;
        System.out.println("Value of a inside function : "+a);
        b=b+20;
        System.out.println("Value of b inside function : "+b);
    }
}
