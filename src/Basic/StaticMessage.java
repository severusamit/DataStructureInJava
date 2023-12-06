package Basic;

public class StaticMessage
{
    public static void main(String args[])
    {
        System.out.println("This Message is from main Block ");
    }
    static
    {
        System.out.println("This Message from static Block");
    }
}
