package Basic;
import java.util.Scanner;
public class SwitchCaseGrading
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        char grade;
        System.out.println("enter Grade ? ");
        grade = in.nextLine().charAt(0);
        switch(grade)
        {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Very Good");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
