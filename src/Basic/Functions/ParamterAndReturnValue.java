package Basic.Functions;

import java.util.Scanner;

public class ParamterAndReturnValue
{
    static int product(int x, int y)
    {
        int z;
        z=x*y;
        System.out.println("Product of two numbers : " +z);
        return z;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,r;
        System.out.println("enter two nos :");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Value of a :" + a + "\n Value of b :" +b);
        r=product(a,b);

    }
}
