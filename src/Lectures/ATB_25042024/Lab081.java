package Lectures.ATB_25042024;

import java.util.Scanner;

public class Lab081
{
    public static void main(String[] args) {
        System.out.println("Enter the browser name:");
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();
        browser = browser.toLowerCase();

        switch(browser)
        {
            case "chrome":
                System.out.println("Chrome browser started");
                break;
            case "firefox":
                System.out.println("Firefox browser started");
                break;
            case "safari":
                System.out.println("Safari browser started");
                break;
            default:
                System.out.println("This is not a browser");
        }
    }
}
