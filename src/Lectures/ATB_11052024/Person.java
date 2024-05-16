package Lectures.ATB_11052024;

public class Person
{
    String name;
    byte age;
    double salary;
    long phone_number;
    String[] address;
    boolean isMale;
    String dob;
    String eye_color;

    void walk()
    {
        System.out.println("I am walking");
    }

    void talk(String msg)
    {
        System.out.println("I want to talk about "+ msg);
    }

    String sleep()
    {
        return "Sleeping";
    }

    String eat(String item)
    {
        return item;
    }
}
