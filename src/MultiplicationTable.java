import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); //scanner class
        int n;
        System.out.println("Enter a number whose table you want ?");
        n=in.nextInt(); //user input
        int multiplication=0;

        for(int i=1;i<=10;i++) // using for loop
        {
            multiplication = n*i;
            System.out.println("Table of "+n+" times "+i+" is " +multiplication);
        }


    }
}
