package Basic.Functions;

public class RecursionFibonaaciSeries
{
    public static void main(String args[])
    {
        fibonacci(-1,1,10);
    }
    static void fibonacci(int a ,int b,int n)
    {
        int c=0;
        if(n>=1)
        {
            c=a+b;
            System.out.println(+c+ " ");
            a=b;
            b=c;
            fibonacci(a,b,n-1);
        }
    }
}
