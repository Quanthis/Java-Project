package devices;

public class LPG extends Car
{
    public LPG(String model, String producer, Integer yearOfProduction, double horsePower, String suspension, double worth)
    {
        super(model, producer, horsePower, suspension, worth,yearOfProduction);
    }

    public LPG(String model, String producer, double power, String suspenion, Integer yearOfProduction)
    {
        super(model, producer, power, suspenion, yearOfProduction);
    }

    @Override
    public void Refuel()
    {
        System.out.println("Refueled quite cheap.");
    }
}
