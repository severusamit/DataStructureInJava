package Inheritance;
class jan
{
    int a;
    void get1()
    {
        a=1000;
    }
    int put1()
    {
        return a;
    }
}
class feb extends jan
{
    int b;
    void get2()
    {
        get1();
        b=2000;
    }
    int put2()
    {
        b=b+put1();
        return b;
    }
}

class mar extends feb
{
    int c;
    void get3()
    {
        get2();
        c=3000;
    }
    int put3()
    {
        c=c+put2();
        return c;
    }
}
class apr extends mar
{
    int d;
    void get4()
    {
        d=4000;
        get3();
    }
    void put4()
    {
        d=d+put3();
        System.out.println("Sum of all data : "+d);

    }
}






public class MultiLevel
{
    public static void main(String args[])
    {
        apr ob = new apr();
        ob.get4();
        ob.put4();
    }
}
