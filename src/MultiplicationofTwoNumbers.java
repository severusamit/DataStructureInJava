import java.util.Scanner;
public class MultiplicationofTwoNumbers
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        float n,x;
        n=in.nextFloat();
        x=in.nextFloat();

        float result = n * x;
        System.out.println("Multiplication of two number " + n +" and " + x +" is : "+result );
    }
}
