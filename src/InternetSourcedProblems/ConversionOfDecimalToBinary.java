package InternetSourcedProblems;


import java.util.Scanner;

public class ConversionOfDecimalToBinary {
    static void decimalToBinary(int n)
    {
        int [] binaryNum = new int [1000];
        int i=0;
        while(n>0)
        {
            binaryNum[i]=n%2;
            n/=2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binaryNum[j]);
        }

    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter decimal value : ");
        n=in.nextInt();
        System.out.println("Decimal -- "+n);
        System.out.print("Binary  --");
        decimalToBinary(n);

    }
}