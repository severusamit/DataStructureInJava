package Basic;



import java.util.Scanner;

public class TakingStringFromInteger {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name;
        int roll;
        System.out.println("Enter roll no : ");
        roll =in.nextInt();
        System.out.println("Enter name  : ");
        in.nextLine();
        name = in.nextLine();
        System.out.println("Name  : " +name);
        System.out.println("Roll  :" +roll);
    }
}
