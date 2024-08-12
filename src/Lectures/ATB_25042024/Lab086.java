package Lectures.ATB_25042024;

public class Lab086
{
    public static void main(String[] args) {
        int itemcode = 010;
        switch (itemcode)
        {
            case 001,002,003:
                System.out.println("This is a electronic gadget");
                break;
            case 004,005,006:
                System.out.println("This is a mechanical gadget");
                break;
            default:
                System.out.println("Oops !!");
        }
    }
}
