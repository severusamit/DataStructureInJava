package CodingNinjas.classesandobjects;

public class Student {
    String name;
    final private int rollNumber;
    double cgpa;
    final double conversionFactor=.9;
    int numStudents;
    public Student(String name , int rollNumber)
    {
        this.name=name;
        this.rollNumber=rollNumber;
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
