package Homework;

import java.util.Scanner;

public class Prog1
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num < 0)
        {
            System.out.println("Entered number is negative");
        }
        else if(num == 0)
        {
            System.out.println("Entered number is 0");
        }
        else
        {
            System.out.println("Entered number is positive");
        }

        sc.close();
    }
}
