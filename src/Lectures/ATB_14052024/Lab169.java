package Lectures.ATB_14052024;

public class Lab169
{
    public static void main(String[] args)
    {
        ATBPerson objRef1 = new ATBPerson();
        ATBPerson objRef2 = new ATBPerson();
        ATBPerson objRef3 = null;

        System.out.println(objRef1.courseName);  // DC is used to assign the value to an instance variable.
        System.out.println(objRef1.isMarried);
    }
}

