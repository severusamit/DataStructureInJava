package CodingNinjas.classesandobjects.Inheritance;

public class VehicleUse
{
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        v.color ="Red";
        v.print();
        System.out.println("-----------------------");
        Car c = new Car();
        c.color="Black";
        c.maxSpeed=100;
        c.numDoors=4;
        c.print();
        System.out.println("-----------------------");
        Bicycle b = new Bicycle();
        b.print();


    }
}
