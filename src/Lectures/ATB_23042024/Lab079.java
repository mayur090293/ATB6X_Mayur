package Lectures.ATB_23042024;

import java.util.Scanner;

public class Lab079
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sides one by one:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && b==c)
        {
            System.out.println("Triangle is an equilateral triangle");
        }
        else if (a==b || b==c || a==c)
        {
            System.out.println("Triangle is an isosceles triangle");
        }
        else
        {
            System.out.println("Triangle is an scalene triangle");
        }
        sc.close();
    }
}
