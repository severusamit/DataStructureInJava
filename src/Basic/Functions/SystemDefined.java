package Basic.Functions;
import java.util.Scanner;
public class SystemDefined
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any floating point value  : ");
        double n,c,f;
        n= input.nextDouble();
        c=Math.ceil(n);
        f=Math.floor(n);
        System.out.println("Ceil : " + c + " \n Floor : " +f);

    }
}
