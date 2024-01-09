package CodingNinjas.classesandobjects;

public class Student {
    String name;
    private int rollNumber;

    public int getRollNumber()
    {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        if(rollNumber<=0)
        {
            return;
        }
        System.out.println("This function :"+this);
        this.rollNumber=rollNumber; // obj.rollNum = rollNum
    }
}
