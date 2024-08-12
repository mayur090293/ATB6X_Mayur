package Lectures.ATB_25042024;

import java.util.Scanner;

public class Switch_homework
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();
        System.out.println("Enter the operator to perform operation:");
        char c = sc.next().toCharArray()[0];

        switch (c)
        {
            case '+':
            {
                System.out.println(a+b);
                break;
            }
            case '/':
            {
                System.out.println(a/b);
                break;
            }
            case '*':
            {
                System.out.println(a*b);
                break;
            }
            case '%':
            {
                System.out.println(a%b);
                break;
            }
            case '-':
            {
                System.out.println(a-b);
                break;
            }
            default:
            {
                System.out.println("Not a valid operator");
            }

        }

    }
}
