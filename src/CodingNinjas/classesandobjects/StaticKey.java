package CodingNinjas.classesandobjects;

public class StaticKey
{
    public String name;
    final private int rollNumber;
    double cgpa;
    final double converisonFactor= 0.95;
    static int numStudents;

    public StaticKey(String name, int rollNumber){
        this.name=name;
        this.rollNumber= rollNumber;
        numStudents++;
    }

//    public Student(String n){
//      name=n;
//      //rollNumber= 10;
//    }
//    public Student(){
//      name="abc";
//      rollNumber=10;
//    }

    public void print(){
        System.out.println(name+" "+rollNumber);
    }
}
