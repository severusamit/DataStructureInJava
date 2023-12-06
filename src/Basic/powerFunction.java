package Basic;
import java.util.Scanner;
public class powerFunction
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        double r;
        System.out.println("enter value of a and b : ");
        a=in.nextInt();
        b=in.nextInt();
        r=Math.sqrt(Math.pow(a+b,3));
    }
}
