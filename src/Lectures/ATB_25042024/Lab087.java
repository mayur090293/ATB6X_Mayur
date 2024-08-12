package Lectures.ATB_25042024;

public class Lab087
{
    public static void main(String[] args)
    {
        int itemcode = 005;
        // No need to break statement
        switch (itemcode)
        {
            case 001, 002, 004 -> System.out.println("This is a laptop");
            case 003, 005, 006 -> System.out.println("This is a desktop");
            case 007, 010, 011-> System.out.println("This is a mobile device");
            default -> System.out.println("Oops !!");
        }

    }
}
