package devices;

import notDevices.Saleable;

public abstract class Device implements Saleable
{
    public final String model;
    public final String producer;
    protected Integer yearOfProduction;
    protected double value;

    public Device(String model, String producer, Integer yearOfProduction)
    {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public Device(String model, String producer, Integer yearOfProduction, double value)
    {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public int getYearOfProduction()
    {
        return this.yearOfProduction;
    }

    @Override
    public String toString()
    {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void turnOn();
}
