package Class;

import java.util.Scanner;

public class aa3SumOfTwoNo
{
    int a,b,c;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a and b ?");
        a= in.nextInt();;
        b=in.nextInt();
        cal();
        put();
    }
    void cal()
    {
        c=a+b;
    }
    void put()
    {
        System.out.println("value of a :" +a);
        System.out.println("Value of b : "+b);
        System.out.println("Sum of two number  :"+c);
    }
}
