package Basic;

import java.util.Scanner;

public class MaxNumberUsingCOndtionalOperator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a,b,c,max=0;
        System.out.println("Enter three different number : ");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        max =(a>b && a>c)?a : (b>c? b:c);
        System.out.println("max no : "+max);
    }
}
