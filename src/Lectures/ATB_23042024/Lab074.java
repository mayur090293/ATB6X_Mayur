package Lectures.ATB_23042024;

import java.util.Scanner;

public class Lab074
{
    public static void main(String[] args)
    {
        System.out.println("Please enter an integer:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2 == 0)
        {
            System.out.println("This is an even number");
        }
        else
        {
            System.out.println("This is an odd number");
        }
        sc.close();
    }
}
