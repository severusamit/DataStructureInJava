package Basic.FunctionOverloading;

import java.util.Scanner;

public class abc5
{
    int a,b;
    double c,d;
    void get_data(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integer value ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Enter two double value ");
        c=in.nextDouble();
        d=in.nextDouble();
        System.out.println("1st Int Value : "+a);
        System.out.println("2nd Int Value : "+b);
        sum(a,b);
        System.out.println("1st Double Value : "+c);
        System.out.println("2nd DOuble Value : "+d);
        sum(c,d);
        System.out.println("one Int value : "+a);
        System.out.println("One double value : "+d);
        sum(a,d);
    }
    void sum(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum of two integer values  : "+c);
    }
    void sum(double a,double b)
    {
        double c=a+b;
        System.out.println("Sum of two DOuble Value : "+c);
    }
    void sum(int a,double d)
    {
        double c=a+d;
        System.out.println("Sum of 1st Integer and !st Double  : "+c);
    }
}
class func_aa
{
    public static void main(String args[])
    {
        abc5 ob = new abc5();
        ob.get_data();
    }
}
