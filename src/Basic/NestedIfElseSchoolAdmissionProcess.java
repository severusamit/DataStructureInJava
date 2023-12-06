package Basic;

import java.util.Scanner;
import java.util.Scanner;
public class NestedIfElseSchoolAdmissionProcess {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int marks;

        System.out.println("Enter marks awarded : ");
        marks=in.nextInt();
        if(marks>=65 && marks<=100)
        {
            if(marks>=85)
            {
                System.out.println("Eligible for Science,Comm.. & Arts.");
            }
            else if(marks>=75)
            {
                System.out.println("Eligible for Comm.. & Arts");
            }
            else {
                System.out.println("eligible for Arts");
            }
        }
        if(marks>=55 && marks<65)
        {
            System.out.println("Wait for 2nd round");
        }
        else {
            System.out.println("Not Eligible");
        }



    }
}
