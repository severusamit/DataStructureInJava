package String;
import java.util.*;
class abc11
{
    String st1;
    int ac,i,l;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string :");
        st1=in.nextLine();
        System.out.println("String is : " +st1);
        l=st1.length();
        System.out.println("Length of String : "+l);
        System.out.println("String after conversion ?");

        for(i=0;i<l;i++)
        {
            ac=st1.charAt(i);
            if(ac>=65 && ac<=90)
            {
                System.out.println((char)(ac+32));
            }
            else if(ac>=97 && ac<=122)
            {
                System.out.println((char)(ac-32));
            }
            else
            {
                System.out.println((char)ac);
            }
        }
    }
}
public class ConversionOfStringFromLowercaseToUppercaseAndViceVersa
{
    public static void main(String args[])
    {
        abc11 obj = new abc11();
        obj.get();
    }
}
