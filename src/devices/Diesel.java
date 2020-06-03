package devices;

public class Diesel extends  Car
{
    public Diesel(String model, String producer, Integer yearOfProduction, double horsePower, String suspension, double worth)
    {
        super(model, producer, horsePower, suspension, worth,yearOfProduction);
    }

    public Diesel(String model, String producer, double power, String suspenion, Integer yearOfProduction, double worth)
    {
        super(model, producer, power, suspenion, yearOfProduction, worth);
    }

    @Override
    public void Refuel()
    {
        System.out.println("Refueled.");
    }
}
