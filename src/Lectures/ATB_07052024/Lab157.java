package ATB_07052024;

public class Lab157
{
    //Lab157
    public static void main(String[] args)
    {
        f1();
        String[] names = {"Mayur", "Mahagaonkar"};
        f1(names);
     }

    static void f1(String[] a)
    {
        for(String name : a)
        {
            System.out.println(name);
        }
    }

    static void f1()
    {
        f2();
        System.out.println("f1");
    }

    static void f2()
    {
        System.out.println("f2");
    }
}
