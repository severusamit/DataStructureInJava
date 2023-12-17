package Basic.Functions;

import java.util.Scanner;

public class Addition
{
        static void disp()
        {
            Scanner in = new Scanner(System.in);
            int a,b,c;
            System.out.println(" Enter a and b ?");
            a=in.nextInt();
            b=in.nextInt();
            System.out.println("Value of a :" +a);
            System.out.println("Value of b :" +b);
            c=a+b;
            System.out.println("Sum " +c);
        }
        void disp2()
        {
            Scanner in = new Scanner(System.in);
            int a,b,c;
            System.out.println("enter value of a and b :");
            a=in.nextInt();
            b=in.nextInt();
            System.out.println("Value of a : "+a);
            System.out.println("Value of b : "+b);
            c=a*b;
            System.out.println("Product : "+c);
        }
        public static void main(String args[])
        {
            Basic.Functions.Addition ob = new Basic.Functions.Addition();
            disp();
            ob.disp2();
        }
    }


