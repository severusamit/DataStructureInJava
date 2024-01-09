package CodingNinjas.classesandobjects;

public class Student3
{
    public String name;
    private int rollNumber;

    public int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        if(rollNumber <= 0){
            return;
        }
        System.out.println("This : " +this);
        this.rollNumber= rollNumber;

    }
}
