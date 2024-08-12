package Lectures.ATB_25042024;

import java.util.Scanner;

public class Lab082
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
      //  char value = sc.nextLine().charAt(0);
        char value = sc.nextLine().toCharArray()[0];

        switch(value)
        {
            case 'a':
                System.out.println("This is a vowel");
                break;
            case 'e':
                System.out.println("This is a vowel");
                break;
            case 'i':
                System.out.println("This is a vowel");
                break;
            case 'o':
                System.out.println("This is a vowel");
                break;
            case 'u':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is not a vowel");
        }
        sc.close();
    }
}
