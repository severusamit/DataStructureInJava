package CodingNinjas.classesandobjects;

public class Student {
    String name;
    private int rollNumber;
    public Student(String n , int num)
    {
        name=n;
        rollNumber=num;
    }
    public Student(String n)
    {
        name="abc";
        rollNumber=10;
    }

    public void print()
    {
        System.out.println(name+ " " +rollNumber);
    }
}
