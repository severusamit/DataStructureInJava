package Basic;

import java.util.Scanner;

public class ASCII {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ac;
        char ch;
        System.out.println("Enter any character : ");
        ch = in.nextLine().charAt(0);
        ac=ch;      //type casting
        System.out.println("ASCII value of " + ch + " is "+ac);
        System.out.println("Enter any ASCII value :");
        ac=in.nextInt();
        ch=(char)ac;        //explicit conversion
        System.out.println("Character value of " +ac + "is " +ch);
    }
}
