package Class;

import java.util.Scanner;

public class bus
{
    private String pName;
    private int pAge;
    private double pFare;
    private char pGender;

    void setName(String pName)
    {
       this.pName =pName;
    }
    String getName()
    {
        return pName;
    }
    void setAge(int pAge)
    {
        this.pAge =pAge;
    }
    int getAge()
    {
        return pAge;
    }
    void setFare(double pFare)
    {
        this.pFare = pFare;
    }
    double getFare()
    {
        return pFare;
    }
    void setGender(char pGender)
    {
        this.pGender=pGender;
    }
    char getGender()
    {
        return pGender;
    }
    double cal()
    {
        double d=0;
        if(pAge>=60)
        {
            d=pFare*.30;
        }
        else if (pAge<=12)
        {
            d=pFare*.20;
        }
        else if(pGender =='F' || pGender =='f')
        {
            d=pFare*.10;
        }
        return d;
    }
}

class main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        bus ob = new bus();
        System.out.println(" Enter Passenger Name  :  ");
        ob.setName(in.nextLine());

        System.out.println("Enter gender : ");
        ob.setGender(in.nextLine().charAt(0));

        System.out.println("enter age :");
        ob.setAge(in.nextInt());

        System.out.println("Enter base fare :");
        ob.setFare(in.nextDouble());

        System.out.println("--------------------------------");
        System.out.println("Name       :" +ob.getName());
        System.out.println("Gender     :" +ob.getGender());
        System.out.println("Age        :" +ob.getAge());
        System.out.println("Base fare  :" +ob.getFare());
        System.out.println("Discount   :" +ob.cal());
        System.out.println("Net Fare   :" +(ob.getFare()-ob.cal()));
    }
}
