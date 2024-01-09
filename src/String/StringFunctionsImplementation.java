package String;

import java.util.Scanner;

class abc13
{
    String st1,st2,st3;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string in Lower Case :");
        st1=in.nextLine();
        System.out.println("Enter any String in Upper case : ");
        st2=in.nextLine();
        System.out.println("enter any string with spaces :");
        st3=in.nextLine();

        System.out.println("String in LOWER case                  : " +st1);
        System.out.println("String in LOWER case after Conversion : " +st1.toUpperCase());
        System.out.println("String in UPPER case                  : " +st2);
        System.out.println("String in UPPER case after conversion : " +st2.toLowerCase());
        System.out.println("String with Space                     : " +st3);
        System.out.println("String with Space after Conversion    : " +st3.trim() +" ");
    }
}
public class StringFunctionsImplementation
{
    public static void main(String args[])
    {
        abc13 obj = new abc13();
        obj.get();
    }
}
