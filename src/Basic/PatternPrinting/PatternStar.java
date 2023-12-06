package Basic.PatternPrinting;

import java.util.Scanner;

/*

 */
public class PatternStar
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,k;
        int rows;
        //rows =in.nextInt();
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(k=5;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
