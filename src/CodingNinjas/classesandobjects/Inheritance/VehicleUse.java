package CodingNinjas.classesandobjects.Inheritance;

public class VehicleUse
{
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        //v.color ="Red";        Since String is made Private we are using Getters and Setters 
        v.setColor("red");
        v.maxSpeed=80;
        v.print();
        System.out.println("-----------------------");

        Car c = new Car();
        //c.color="Black";      Since String is made Private we are using Getters and Setters
        c.setColor("black");
        c.maxSpeed=100;
        c.numDoors=4;
        //c.print();     Commenting this Line so that Class car can have another element as numDoors
        c.printCar();   //Implemented printCar in Class Car
        System.out.println("-----------------------");

        Bicycle b = new Bicycle();
        b.print();


    }
}
