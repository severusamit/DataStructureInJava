package Basic;
import java.util.Scanner;
public class SwitchCaseStringEg
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("enter name :");
        name=in.nextLine();
        switch(name)
        {
            case "Modi":
                System.out.println("PM of India");
                break;
            case "Soren":
                System.out.println("CM of Jharkhand");
                break;
            case "Rahul":
                System.out.println("Pappu of Indian Politics");
                break;
            default :
                System.out.println("Cannot find data");
        }
    }
}
