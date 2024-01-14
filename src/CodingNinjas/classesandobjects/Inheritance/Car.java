package CodingNinjas.classesandobjects.Inheritance;

public class Car extends Vehicle {
    int numDoors;
    public void printCar()
    {
        System.out.println("Car " + "color " +getColor() + "maxspeed :" +maxSpeed +  " numDoors :"  +numDoors);
    }
}
