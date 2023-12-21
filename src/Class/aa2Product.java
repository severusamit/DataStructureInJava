package Class;

public class aa2Product
{
    int a,b,c;
    void get(int x, int y)
    {
        a=x;
        b=y;

    }
    void disp()
    {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b :" +b);
        c=a*b;
        System.out.println("Product of two no : "+c);
    }
}
