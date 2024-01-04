package Constructor;

public class DefaultConstructor
{
    int a,b,c;
    DefaultConstructor()
    {
        a=10;
        b=15;
        System.out.println("Value of a :" +a);
        System.out.println("Value of b :" +b);
        c=a+b;
        System.out.println("Sum of Two No : "+c);
    }
}
class abc1
{
    public static void main(String args[])
    {
        DefaultConstructor ob = new DefaultConstructor();
    }
}
