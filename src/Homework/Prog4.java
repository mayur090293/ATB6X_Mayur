package Homework;

import java.util.Scanner;

public class Prog4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("Entered year is a leap year");
        }
        else
        {
            System.out.println("Entered year is not a leap year");
        }
        sc.close();
    }
}
