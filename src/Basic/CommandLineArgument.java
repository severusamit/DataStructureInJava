package Basic;
import java.util.Scanner;
public class CommandLineArgument
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int l;
        l=in.nextInt();
        l=args.length; //count length of command line argument
        System.out.println("Length of command Line Argument is  : "+l);
    }
}
