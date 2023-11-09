package Class_Objects;

public class Student {
    private int rollNumber;
    public String name;   // it is in default  and default is accseeible in same package
    public int getRollNumber(){     //getter
        return rollNumber;
    }
    public void setRollNumber(int num){     //setter
       if(num<=0){
           return;
       }
        rollNumber=num;
    }

}
