package Interface;
interface details
{
    public void name(String n);
    public void roll(int r);
    public void marks(double m);
    public void per(float p);
    public void grade(char g);
}
class student implements details
{
    public void name(String n)
    {
        System.out.println("Name : "+n);
    }
    public void roll(int r)
    {
        System.out.println("Roll Number  :"+r);
    }
    public void marks(double m)
    {
        System.out.println("Marks : "+m);
    }
    public void per(float p)
    {
        System.out.println("Percentage : "+p);
    }
    public void grade(char g)
    {
        System.out.println("Grade : "+g);
    }
    void disp()
    {
        System.out.println("Display All Info");
    }
}

public class Interface1
{
    public static void main(String args[])
    {
        student obj = new student();
        obj.disp();
        obj.name("Danish");
        obj.marks(234);
        obj.per(78.432f);
        obj.grade('A');
    }
}
