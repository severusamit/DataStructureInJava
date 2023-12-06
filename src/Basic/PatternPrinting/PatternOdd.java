package Basic.PatternPrinting;

public class PatternOdd
{
    public static void main(String args[])
    {
        int i,j,rows=5;
        int num=1;
        for( i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num);
            }
            num+=2;
            System.out.println();
        }
    }
}
