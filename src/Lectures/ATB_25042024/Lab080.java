package Lectures.ATB_25042024;

import java.util.Scanner;

public class Lab080
{
    public static void main(String[] args)
    {
        System.out.println("Enter your day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("This is not a valid day");
        }
        System.out.println("The end !!");
    }
}
