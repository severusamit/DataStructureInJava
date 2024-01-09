package CodingNinjas.classesandobjects;

public class Student4
{
    public String name;
    private int rollNumber;

    public Student4(String n, int num){
        name=n;
        rollNumber= num;
    }

    public Student4(String n){
        name=n;
        //rollNumber= 10;
    }
    public Student4(){
        name="abc";
        rollNumber=10;
    }
    public void print(){
        System.out.println(name+" "+rollNumber);
    }
}
