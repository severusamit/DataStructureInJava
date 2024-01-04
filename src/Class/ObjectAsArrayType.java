package Class;
import java.util.*;
public class ObjectAsArrayType
{
    String name;
    int roll;
    double marks;

    void getdata()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter name  : ");
        name=in.nextLine();
        System.out.println("enter roll number  : ");
        roll=in.nextInt();
        System.out.println("enter marks  : ");
        marks =in.nextDouble();
    }
    void putdata()
    {
        System.out.println("Name : " +name);
        System.out.println("Roll : " +roll);
        System.out.println("Marks: " +marks);
    }
}
class main1
{
    public static void main(String args[])
    {
        int i;
        ObjectAsArrayType[] ob = new ObjectAsArrayType[3];  //object creation
        ob[0] =new ObjectAsArrayType();
        ob[1] =new ObjectAsArrayType();
        ob[2] =new ObjectAsArrayType();
        for(i=0;i<3;i++)
        {
            ob[i].getdata();
            System.out.println("--------------------------");
        }
        for(i=0;i<3;i++)
        {
            ob[i].putdata();
            System.out.println("--------------------------");
        }
    }
}
