package Lectures.ATB_25042024;

import java.util.Scanner;

public class Lab092
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        //90 --> 90/10 --> 9 --> A
        //80 --> 86/10 --> 8 --> B
        //70 --> 74/10 --> 7 --> C
        int grade = marks / 10;

        switch (grade)
        {
            case 9:
            {
                System.out.println("A");
                break;
            }
            case 8:
            {
                System.out.println("B");
                break;
            }
            case 7:
            {
                System.out.println("C");
                break;
            }
            case 6:
            {
                System.out.println("D");
                break;
            }
            default:
            {
                System.out.println("E");
            }
        }
    }
}
