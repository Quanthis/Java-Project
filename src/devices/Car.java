package devices;

import notDevices.Human;

public abstract class Car extends Device
{
    private double horsePower;
    private String suspenion;
    private double worth;
    private  boolean turnedOn = false;

    public  Car(String model, String producer, double power, String suspenion, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
        horsePower = power;
        this.suspenion = suspenion;
    }

    public  Car(String model, String producer, double power, String suspenion, double worth, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
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
    public String toString()
    {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", horsePower=" + horsePower +
                ", suspenion='" + suspenion + '\'' +
                ", worth=" + worth +
                ", turned on = " + turnedOn + '\'' +
                '}';
    }

    @Override
    public void turnOn()
    {
        turnedOn = true;
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price)
    {
        if(seller.getCar() == this)
        {
            if(buyer.getCash() >= price)
            {
                buyer.minusCash(price);
                seller.plusCash(price);
                seller.removeCar(this);
                buyer.addCar(this);
                System.out.println("Transaction succeded!");
            }
            else System.out.println("Sorry, transaction failed.");
        }
        else System.out.println("Sorry, transaction failed.");
    }

    public abstract void Refuel();
}
