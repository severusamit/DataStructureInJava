package Inheritance;

import org.w3c.dom.ls.LSOutput;

class parent
{
    void disp()
    {
        System.out.println("S/o Mr Arvind Kumar");
        System.out.println("Lalpur ,Ranchi. Jharkhand");
    }
}
class son1 extends parent
{
    void disp1()
    {
        System.out.println("Mr. B.B.Singh");
        disp();
    }
}
class son2 extends parent
{
    void disp2()
    {
        System.out.println("Mr. C.B.Singh");
        disp();
    }
}
public class Multi
{
    public static void main(String args[])
    {
        son1 obj1 = new son1();
        son2 obj2 = new son2();
        obj1.disp1();
        System.out.println("------");
        obj2.disp2();
    }
}
