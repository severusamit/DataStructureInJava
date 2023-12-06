package Basic;
import java.util.Scanner;
public class SwitchCaseProblem
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int roll;
        System.out.println("Enter roll number  :");
        roll =in.nextInt();
        switch(roll)
        {
            case 1:
                System.out.println("Rahul");
                break;
            case 2:
                System.out.println("Babita");
                break;
            default:
                System.out.println("Invalid Roll number");
                break;
                case 3:
                    System.out.println("Danish");
                    break;
            case 4:
                System.out.println("Suraj");
        }
    }
}
