package Constructor;

public class Overloading
{
    int a,b;
    Overloading(int x,int y)
    {
        a=x;
        b=y;

    }
    Overloading(Overloading p,Overloading q)
    {
        a= p.a +q.a;
        b= p.b +q.b;
    }
    void disp20()
    {
        System.out.println("Value of a  : "+a);
        System.out.println("Value of b  : "+b);
    }
}
class main3
{
    public static void main(String args[])
    {
        Overloading ob1 = new Overloading(20,15);
        Overloading ob2 = new Overloading(2 , 5);
        Overloading ob3 = new Overloading(65 ,34);
        ob1.disp20();
        System.out.println("---------");
        ob2.disp20();
        System.out.println("---------");
        ob3.disp20();
    }
}
