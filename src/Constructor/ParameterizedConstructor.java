/*
When pass Parameter inside Constructor is called Parameterizd Constructor
 */

package Constructor;
import java.util.*;
public class ParameterizedConstructor
{
    int i;
    ParameterizedConstructor(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " +n*i);
        }
    }
}
class main2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int l;
        System.out.println("Enter the number whose Multiplication Table you want ?");
        l=in.nextInt();
        ParameterizedConstructor ob = new ParameterizedConstructor(l);
    }
}
