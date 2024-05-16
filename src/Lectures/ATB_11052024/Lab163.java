package Lectures.ATB_11052024;

public class Lab163
{
    public static void main(String[] args)
    {
        Car tesla = new Car();
        tesla.name= "Tesla";
        System.out.println(tesla.name);
        tesla.model= "model3";
        System.out.println(tesla.model);
        tesla.reveres();
        tesla.topSpeed(200);

        Car lambo = new Car();
        lambo.name= "avantador";
        System.out.println(lambo.name);
        lambo.model= "model3";
        System.out.println(tesla.model);
        lambo.reveres();
        lambo.topSpeed(220);


    }
}
