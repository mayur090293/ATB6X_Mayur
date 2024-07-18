package Lectures.ATB_14052024;

public class ATBPerson
{
    String name; // Instance variables since they are present in a class.
    long phone_num;
    String email;
    boolean isMarried = true;
    String courseName;

   /* void printDetails()
    {
        System.out.println("Printing details of the student");
    }*/

    //Default constructor
    ATBPerson ()
    {
        System.out.println("Hello, this will be called automatically when a object of class is created.");
        // It is a special method with no return type
        // It is called once, when you create new object
        // It has same name as the class name
        courseName = "ATB"; // This is an instance variable
    }
}
