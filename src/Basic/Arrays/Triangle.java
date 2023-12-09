package Basic.Arrays;
import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,sc=0,ld=0,rd=0,at=0,bt=0;
        int arr[][]=new int[3][3];
        System.out.println("Enter 3 by 3 matrix :");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=in.nextInt();

            }
        }
        System.out.println("Matrix is  : ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(arr[i][j] +" ");
                if(j>i)
                {
                    at=at+arr[i][j];
                }
                if(i>j)
                {
                    bt =bt+arr[i][j];
                }
                if(i==j)
                {
                    ld=ld+arr[i][j];
                }
                if(i+j==2)
                {
                    rd=rd+arr[i][j];
                }
            }
            System.out.println();
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    sc= sc+arr[i][j];
                }
                System.out.println(sc+ " ");
                sc=0;
            }
            System.out.println("\n Sum of above triangle : " +at);
            System.out.println("Sum of below triangle : " +bt);
            System.out.println("Sum of Left Diagonal : "+ld);
            System.out.println("Sum of Right Diagonal :"+rd);
        }
    }
}
