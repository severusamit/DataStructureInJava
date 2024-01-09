package CodingNinjas.classesandobjects;

import java.util.Scanner;

public class StudentUse
{
//    Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1);   // address where object is stored
        s1.name="Amit";
        //s1.rollNumber=100;
        System.out.println(s1.name + " "); // +s1.rollNumber);


        Student s2 = new Student();
        s2.name="Ankush";
        //s2.rollNumber=50;
        //System.out.println(s2.name + " " +s2.rollNumber);
    }

}
