package Basic.Arrays;
import java.util.Scanner;
public class Max_Min
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,s,max,min;
        System.out.println("Enter array size ?");
        s=in.nextInt();
        int arr[] = new int[s];

        System.out.println("Enter aray element ?");
        for(i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        max=arr[0];
        min=arr[0];
        System.out.println("Array elements : ");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Max Number  : " +max);
        System.out.println("Min Number  : " +min);
    }
}
