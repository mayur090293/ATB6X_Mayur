package ATB_07052024;

public class Lab149
{
    public static void main(String[] args)
    {
        //Function to print Hi 100 times
        for(int i=0; i <= 100; i++)
        {
            sayHi();
            sayBye();
        }
    }

    static void sayBye()
    {
        System.out.println("Bye");
    }

    static void sayHi()
    {
        System.out.println("Hi");
    }
}
