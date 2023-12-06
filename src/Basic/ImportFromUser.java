package Basic;

import java.util.Scanner;
public class ImportFromUser {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a and b : ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Value of a : " +a);
        System.out.println("Value of b : " +b);
        c=a+b;
        System.out.println("sum of two nos  : " +c);
    }
}

