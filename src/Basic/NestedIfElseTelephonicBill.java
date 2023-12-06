package Basic;
import java.util.Scanner;
public class NestedIfElseTelephonicBill
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int netCall,mr=100;
        double bill=0;
        System.out.println("Number of call ? ");
        netCall=in.nextInt();

        if(netCall>=1 && netCall<=200)
        {
            bill=mr;
        }
        else if(netCall>=201 && netCall<=300)
        {
            bill =(netCall-200)*50 +mr;

        }
        else if(netCall>=301 && netCall<=400)
        {
            bill=(netCall-200-100)*.75+50+mr;
        }
        else if(netCall>=401 && netCall<=500)
        {
            bill = ((netCall - 200 - 100 - 100) * 1) + 50 + 75 + mr;
        }
        else if(netCall>500)
        {
            bill =(netCall-200-100-200-100)*1.50 +50+75+100+mr;
        }
        System.out.println("Bill Amount  :" +bill);
    }

}
