package Class_Objects;

import java.util.Scanner;

public class StudentUse
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        Student s1= new Student("amit",67);  //constructor input
        Student s2= new Student("pppp",90);     
        System.out.println(s1);
    //    s1.name="Manish";
    //    s1.setRollNumber(2005638);
        System.out.println(s1.name + "  " + s1.getRollNumber());

    //    s2.name= "Ankush";
    //    s2.rollNumber= 50;
    //    System.out.println(s2.name + " " + s2.getRollNumber());

    }
}
