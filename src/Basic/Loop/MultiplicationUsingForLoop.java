package Basic.Loop;

import java.util.Scanner;

public class MultiplicationUsingForLoop
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,n;
        System.out.println("enter number whose multiplication table you want ?");
        n=in.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(+ n + " * " + i + " = " +n*i);
        }
    }
}
