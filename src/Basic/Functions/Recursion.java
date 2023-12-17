package Basic.Functions;

public class Recursion
{
    static void disp4(int i)
    {
        if(i<=10) {
            System.out.println(i);
            disp4(i + 1);       //self calling
        }
    }
    public static void main(String args[])
    {
        disp4(1);
    }
}
