package String;
import java.util.*;
import java.util.Scanner;

class merge
{
    String firstName,lastName,name;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        firstName = in.nextLine();
        System.out.println("Enter Last Name  : ");
        lastName=in.nextLine();

        System.out.println("First Name : " +firstName);
        System.out.println("Last NAme  : " +lastName);
        name = firstName + " " + lastName;
        System.out.println("name : " +name);

        System.out.println("Name  with in built function : " + firstName.concat(" ").concat(lastName));
    }
}
public class MergeTwoStrings {
    public static void main(String args[])
    {
        merge obj = new merge();
        obj.get();
    }
}
