package notDevices;

import devices.Car;
import devices.Phone;
import notDevices.Animal;
import notDevices.Human;

import java.io.File;

public class Program
{
    public static void main(String[] args)
    {
        Animal doggo = new Animal("Puszek", new File("somedog.jpg"), "Blablador");
        var kowalskyPhone = new Phone("1234567890", "someNet", 9999888);
        var Human = new Human("Analiza","Kowalski", new Double(42), 000000001, kowalskyPhone, doggo);

        doggo.feed();
        doggo.goForWalk(5.0);
        //doggo.goForWalk(15.0);

        var someNiceCar = new Car("Aventador", "Lamborghini", 730.0, "double wishbone rear suspension", 2015);

        Human.setCar(someNiceCar);

        System.out.println("notDevices.Human's car horsepower: " + Human.getCar().getHorsePower() + "\nnotDevices.Human's car model: " + Human.getCar().model);

        Human.getSalary();

        Human.setSalary(-5000);

        Human.setSalary(5000);
        Human.getSalary();

        var expensiveCar = new Car("Aventador", "Lamborghini", 730.0, "double wishbone rear suspension", 250000.0, 2017);

        var richHooman = new Human("Elon", "Musk", 115.0, 999999, new Phone(95136, "5G", "Xiamoi 5G", "Oxami", 2022));

        richHooman.setSalary(1000000);

        richHooman.setCar(expensiveCar);

        var otherExpensiveCar = new Car("Aventador", "Lamborghini", 730.0, "double wishbone rear suspension", 250000.0, 2019);

        if(otherExpensiveCar == expensiveCar)
        {
            System.out.println("This is the very same car.");
        }
        else
        {
            System.out.println("That's probably not the same car.");
        }

        System.out.println(expensiveCar);

        if(otherExpensiveCar.toString() == expensiveCar.toString())
        {
            System.out.println("This is the very same car.");
        }
        else
        {
            System.out.println("That's probably not the same car.");
        }

        System.out.println(otherExpensiveCar.toString());

        expensiveCar.turnOn();
        System.out.println(expensiveCar.toString());

        var merchant = new Human("Merchant", otherExpensiveCar, 1000000000.0);
        var peasant = new Human("Happy Peasant", null, 30000.0);

        System.out.println("Peasant before shopping: " + peasant.toString() + "\nMerchant before selling: " + merchant.toString());
        otherExpensiveCar.Sell(merchant, peasant, 29000.0);
        System.out.println("Peasant after shopping: " + peasant.toString() + "\nMerchant after selling: " + merchant.toString());
    }
}
