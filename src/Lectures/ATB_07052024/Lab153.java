package ATB_07052024;

public class Lab153
{
    public static void main(String[] args)
    {
       //No return type, No parameter
        saySomething();

        // No return type, with parameter
        sayHello("Mayur");

        //Return with no parameter
        sumOfTwoBad(3,10);

        //Return with parameter
        int c =sumOfTwoGood(50, 37);
        System.out.println(c);

    }

    static int sumOfTwoGood(int x, int y)
    {
        return x+y;
    }

    static void sumOfTwoBad(int a, int b)
    {
        System.out.println(a+b);
    }

    static void sayHello(String name)
    {
        System.out.println("Hello " + name);
    }

    static void saySomething()
    {
        System.out.println("No return type, No parameter");
    }
}
