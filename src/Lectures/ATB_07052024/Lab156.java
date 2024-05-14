package ATB_07052024;

public class Lab156
{
    public static void main(String[] args)
    {
        System.out.println("Start of the Program");
        main(49);
        main("Mayur");
        System.out.println("End of the Program");

    }

    static void main (String a)
    {
        System.out.println("Hello");
    }
    static int main (int a)
    {
        return a;
    }

    static void giveMoneyToBeggar()
    {
        System.out.println("Blessings");
    }

    static int giveMoneyToFriend(int i)
    {
        i= i-2;
        return i;
    }
}
