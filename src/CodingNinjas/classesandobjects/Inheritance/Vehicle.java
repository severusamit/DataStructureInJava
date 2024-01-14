package CodingNinjas.classesandobjects.Inheritance;

public class Vehicle
{
    private String color;
    int maxSpeed;
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)      //To access private member String
    {
        this.color=color;
    }

    public void print()
    {
        System.out.println("Vehicle " + " color : " + color + " maxspped : "+ maxSpeed);
    }
}
