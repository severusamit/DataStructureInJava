package Class;

public class NestedClass
{
    class inner
    {
        static int a=10;
        static int b=30;
        static int c =0;
        static void disp8()
        {
            System.out.println("Value of a  : "+a);
            System.out.println("Value of b  : "+b);
            c=a+b;
            System.out.println("Sum of two no : "+c);
        }
    }
    public static void main(String args[])
    {
        inner.disp8();
    }
}
