package Class;
import java.util.*;
public class pay1
{
    int basic;
    String name;
    double da,hra,pf,netsal;
    void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter name : ");
        name = in.nextLine();
        System.out.println(" Enter basic Salaey :  ");
        basic =in.nextInt();
    }
    void cal()
    {
        da=basic*.50;
        hra =basic*.30;
        pf=basic*.12;
        netsal = basic + da+ hra -pf;

    }
    void disp()
    {
        System.out.println("Name   : "+name);
        System.out.println("Basic  : "+basic);
        System.out.println("DA     :"+da);
        System.out.println("HRA    :"+hra);
        System.out.println("PF     :"+pf);
        System.out.println("NetSalary :"+netsal);
    }
}
