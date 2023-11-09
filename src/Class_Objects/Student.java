package Class_Objects;

public class Student {
    private int rollNumber;
    public String name;   // it is in default  and default is accessible in same package

    public Student(String n,int num){               //Initializing Constructor
        rollNumber=num;
        name = n;
    }
    public int getRollNumber(){     //getter
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){     //setter
       if(rollNumber<=0){
           return;
       }
        this.rollNumber=rollNumber;
        System.out.println("set roll function : " +this);
    }

}
