package Lectures.ATB_11052024;

public class Car
{
    // attributes, data members, instance variables, properties
    String name;
    String size;
    int tyres;
    String model;
    String color;

    // behaviour, methods, functionalities
    void reveres()
    {
        System.out.println("Take reverse");

    }
    void topSpeed(int speed)
    {
        System.out.println("Speed of the car is "+ speed);;
    }
    String musicSystem(String musicsys)
    {
        return musicsys;
    }
}
