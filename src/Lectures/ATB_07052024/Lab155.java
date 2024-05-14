package ATB_07052024;

public class Lab155
{
    public static void main(String[] args)
    {
          int money = giveMoneyToFriend(100);
        System.out.println(money);
          giveMoneyToBeggar();

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
