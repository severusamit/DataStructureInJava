package String;
import java.util.Scanner;
class abc14
{
    String st1,st2;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string in LOWER case  : ");
        st1 =in.nextLine();
        System.out.println("Enter same string in UPPER case : ");
        st2 =in.nextLine();
        System.out.println("String in LOWER case            : " +st1);
        System.out.println("String in UPPER case             : " +st2);
        System.out.println("-------------------------------------------");
        System.out.println("Comparison Between Both String           : ");
        System.out.println(st1.compareTo(st2));
        System.out.println("--------------------------------------------");
        System.out.println("Compare both String By Ignoring Case     : ");
        System.out.println(st1.compareToIgnoreCase(st2));
        System.out.println("Both Strings are equal : ");
        System.out.println(st1.equals(st2));
        System.out.println("Both Strings are equal by ignoring cases : ");
        System.out.println(st1.equalsIgnoreCase(st2));

    }
}
public class CompareTwoString
{
    public static void main(String args[])
    {
        abc14 obj = new abc14();
        obj.get();
    }
}
