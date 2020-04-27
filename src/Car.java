public class Car
{
    public final String model;
    public final String producer;
    private double horsePower;
    private String suspenion;
    private double worth;

    public  Car(String model, String producer, double power, String suspeniobn)
    {
        this.model = model;
        this.producer = producer;
        horsePower = power;
        this.suspenion = suspenion;
    }

    public  Car(String model, String producer, double power, String suspeniobn, double worth)
    {
        this.model = model;
        this.producer = producer;
        horsePower = power;
        this.suspenion = suspenion;
        this.worth = worth;
    }

    public double getHorsePower()
    {
        return  horsePower;
    }

    public  void setHorsePower(double newPower)
    {
        horsePower = newPower;
    }

    public String getSuspenion()
    {
        return  suspenion;
    }

    public void setSuspensionHeight(String suspenion)
    {
        this.suspenion = suspenion;
    }

    public  double getWorth()
    {
        return  worth;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", horsePower=" + horsePower +
                ", suspenion='" + suspenion + '\'' +
                ", worth=" + worth +
                '}';
    }
}
