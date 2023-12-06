package Basic.PatternPrinting;
/*
1
12
123
1234
 */
import java.util.Scanner;

public class Pattern1
{
    public static void main(String args[])
    {
        int i,j;

        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
Trying to step by step
when i = 1
print ->1
j values is 1 and limit exceeded
when i=2
print ->1 2
j values is 2 and loop terminates
when i=3
print -> 1 2 3
j values is 3 and loop terminates
when i =4
print -> 1 2 3 4
j values is 4 and loop terminates
when i=5
print -> 1 2 3 4 5
j values is 5 and loop terminates as j<=i which is 6<=5

 */