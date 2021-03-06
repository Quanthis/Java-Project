package devices;

import notDevices.Human;
import notDevices.Transaction;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Date;

public abstract class Car extends Device implements Comparable<Car>
{
    private LinkedList<Transaction> Transactions = new LinkedList<Transaction>();

    private double horsePower;
    private String suspenion;
    private  boolean turnedOn = false;

    public Car(String model, String producer, double power, String suspenion, Integer yearOfProduction, double worth)
    {
        super(model, producer, yearOfProduction, worth);
        horsePower = power;
        this.suspenion = suspenion;
    }

    public Car(String model, String producer, double power, String suspenion, double worth, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction, worth);
        horsePower = power;
        this.suspenion = suspenion;
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
        return  super.value;
    }

    @Override
    public String toString()
    {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", horsePower=" + horsePower +
                ", suspenion='" + suspenion + '\'' +
                ", worth=" + value +
                ", turned on = " + turnedOn + '\'' +
                ", year of production = " + yearOfProduction + '\'' +
                ", Transactions: = " + getTransactions() + '\'' +
                '}';
    }

    public String getTransactions()
    {
        String result = "anything";
        for(int i = 0; i < Transactions.size(); ++i)
        {
            result += "\n" + Transactions.get(i);
        }
        return result;
    }

    @Override
    public void turnOn()
    {
        turnedOn = true;
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) throws Exception
    {
        if(seller.getCar(0) == this)
        {
            if(buyer.getFreeParkingLot() != null)
            {
                if(buyer.getCash() >= price)
                {
                   buyer.minusCash(price);
                    seller.plusCash(price);
                    seller.removeCar(this, 0);
                    buyer.addCar(this, buyer.getFreeParkingLot());
                    System.out.println("Transaction succeded!");
                    Transactions.add(new Transaction(buyer, seller, price, new Date()));
                }
                else
                {
                    throw  new Exception("Sorry, you cannot afford that car.");
                }
            }
            else
            {
                throw new Exception("Buyer does not have a free parking lot.");
            }
        }
        else
        {
           throw new Exception("You cannot sell things you don't have, scammer!");
        }
    }

    @Override
    public int compareTo(Car car)
    {
        int compareYear = car.yearOfProduction;
        return  this.yearOfProduction - compareYear;
    }

    public abstract void Refuel();
}
