package String;
import java.util.*;
import java.util.Scanner;

class abc10
{
    String st1,st2,st3;
    char ch;
    int i,l;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string ?");
        st1 =in.nextLine();
        System.out.println("String is : "+st1);
        l=st1.length();
        System.out.println("Length of string : " +l);

        for(i=0;i<l;i++)
        {
            ch = st1.charAt(i);
            st2 = st2+ch;
            st3 = ch+st3;

        }
        System.out.println("Value of st2 : "+st2);
        System.out.println("value of st3 : "+st3);
    }
}
public class String2 {
    public static void main(String args[])
    {
        abc10 obj = new abc10();
        obj.get();
    }
}
