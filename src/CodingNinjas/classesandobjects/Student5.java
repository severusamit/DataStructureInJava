package CodingNinjas.classesandobjects;

public class Student5
{
    public String name;
    final private int rollNumber;
    double cgpa;
    final double converisonFactor= 0.95;

    public Student5(String name, int rollNumber){
        this.name=name;
        this.rollNumber= rollNumber;
    }


    public void print(){
        System.out.println(name+" "+rollNumber);
    }
}
