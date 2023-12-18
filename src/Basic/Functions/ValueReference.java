package Basic.Functions;

import java.util.Scanner;

public class ValueReference
{
    static void disp6(int arr[])
    {
        int i,l;
        l= arr.length;
        for(i=0;i<l;i++)
        {
            arr[i]=arr[i]+2;

        }
        System.out.println("Array element inside function : ");
        for(i=0;i<l;i++)
            System.out.println(arr[i]+ " ");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int s,i;
        System.out.println("Enter array size :");
        s=in.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array element :");
        for(i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Array element before function :");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        disp6(arr);
        System.out.println();
        System.out.println("Array element after function ");
        for(i=0;i<s;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
