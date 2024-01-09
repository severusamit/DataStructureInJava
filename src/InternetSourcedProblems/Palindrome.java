package InternetSourcedProblems;
import java.util.*;
class abc16
{
    String st1,st2= " ";
    char ch;
    int i,l;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String ?");
        st1=in.nextLine();
        System.out.println("String is : "+st1);
        l=st1.length();
        for(i=0;i<l;i++)
        {
            ch=st1.charAt(i);
            st2=ch+st2;
        }
        System.out.println("String In Reverse : " +st2);
        if(st1.equals(st2))
        {
            System.out.println("Given String is Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
public class Palindrome
{
    public static void main(String args[])
    {
        abc16 obj = new abc16();
        obj.get();
    }
}
