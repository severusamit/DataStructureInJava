package Basic;

public class ParseInt
{
    public static void main(String args[])
    {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        System.out.println("Value of 1st  : "+a);
        System.out.println("Value of 2nd  : "+b);
        c=a+b;
        System.out.println("Sum of a and b : " +c);
    }
}
