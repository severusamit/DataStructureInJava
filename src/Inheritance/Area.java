package Inheritance;
import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.*;
public class Area
{
    int a,b;
    double area;
    Scanner in = new Scanner(System.in);

}
class circle extends Area{
    void area_of_circle()
    {
        System.out.println("enter Radius of circle :");
        a=in.nextInt();
        area=3.14*a*a;
        System.out.println("Area of Circle : "+area);
    }
}

class rectangle extends Area
{
    void areaofRect()
    {
        System.out.println("enter length and breadth of rectangle :");
        a=in.nextInt();
        b=in.nextInt();
        area=a*b;
        System.out.println("Area of Rectangle  : "+area);
    }
}

class triangle extends Area
{
    void areaofTriangle()
    {
        System.out.println("Enter base and height of triangle :");
        a=in.nextInt();
        b=in.nextInt();
        area = (.5)*a*b;
        System.out.println("Area of Triangle : "+area);
    }
}
class main4
{
    public static void main(String args[])
    {
        circle ob1 = new circle();
        rectangle ob2 = new rectangle();
        triangle ob3 = new triangle();

        ob1.area_of_circle();
        ob2.areaofRect();
        ob3.areaofTriangle();
    }
}