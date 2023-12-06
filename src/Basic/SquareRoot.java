package Basic;
import java.util.Scanner;
public class SquareRoot
{
    public static void main(String args[]){
        int n;double r;
        Scanner in = new Scanner(System.in);

        System.out.println("enter any number : ");
        n= in.nextInt();
        r=Math.sqrt(n);

        System.out.println("Square root of  : " + n + " is  " +String.format("%.2f",r));
    }
}
