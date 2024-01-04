package Inheritance;
class base {
    int bankb, land;

    void get() {
        bankb = 30000;
        land = 100;

    }

    void put()
    {
        System.out.println("Land          :" +land);
        System.out.println("Bank Balance  :" +bankb);
    }
}
class son extends base{
    int sal;
    void getdata()
    {
        get();
        sal=20000;
    }
    void putdata()
    {
        put();
        System.out.println("Salary        : " +sal);
    }
}
public class Single
{
    public static void main(String args[])
    {
        son ob = new son();
        ob.getdata();
        ob.putdata();
    }
}
