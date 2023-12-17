package Basic.Functions;

import java.util.Scanner;

public class ParameterAndNoReturnValue
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two different number : ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
        hcf_lcm(a,b);
    }
    static void hcf_lcm(int a,int b)
    {
        int hcf=0,lcm=0,m,i;
        m=a<b?a:b;
        for(i=1;i<=m;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        lcm =a*b/hcf;
        System.out.println("HCF : " +hcf);
        System.out.println("LCM : " +lcm);
    }
}
