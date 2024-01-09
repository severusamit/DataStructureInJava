package String;
import java.util.*;
class abc12
{
    String st1;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string :");
        st1 =in.nextLine();
        System.out.println("String is : "+st1);
        System.out.println("String after replace : " +st1.replace('e','a'));
    }
}
public class ReplaceString
{
    public static void main(String args[])
    {
        abc12 obj = new abc12();
        obj.get();
    }
}
