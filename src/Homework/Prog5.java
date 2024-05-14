package Homework;

import java.util.Scanner;

public class Prog5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();

        if (num <= 1)
        {
            System.out.println("Number is not a prime number");
        }
        else if (num % 2 != 0)
        {
            System.out.println("Number is a prime number");
        }
        else
        {
            System.out.println("Number is not a prime number");
        }
        sc.close();
    }
}
