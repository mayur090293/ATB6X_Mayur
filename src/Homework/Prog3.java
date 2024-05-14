package Homework;

import java.util.Scanner;

public class Prog3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character:");
        String str = sc.next();
        int i = 0;
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Entered character is a vowel");
        }
        else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Entered character is a vowel");
        }
        else
        {
            System.out.println("Entered character is a consonant");
        }
        sc.close();
    }
}
