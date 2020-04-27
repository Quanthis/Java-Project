import java.io.File;
import java.math.BigDecimal;

public class Program
{
    public static void main(String[] args)
    {
        Animal doggo = new Animal("Puszek", new File("somedog.jpg"), "Blablador");
        var kowalskyPhone = new Phone(1234567890, "someNet", 9999888);
        var Human = new Human("Analiza","Kowalski", new Double(42), 000000001, kowalskyPhone, doggo);

        doggo.feed();
        doggo.goForWalk(5.0);
        //doggo.goForWalk(15.0);

        var someNiceCar = new Car("Aventador", "Lamborghini", 730.0, "double wishbone rear suspension");

        Human.setCar(someNiceCar);

        System.out.println("Human's car horsepower: " + Human.getCar().getHorsePower() + "\nHuman's car model: " + Human.getCar().model);

        Human.getSalary();

        Human.setSalary(-5000);

        Human.setSalary(5000);
        Human.getSalary();

        var expensiveCar = new Car("Aventador", "Lamborghini", 730.0, "double wishbone rear suspension", 250000.0);

        var richHooman = new Human("Elon", "Musk", 115.0, 999999, new Phone(95136, "5G"));

        richHooman.setSalary(1000000);

        richHooman.setCar(expensiveCar);

        var otherExpensiveCar = new Car("Aventador", "Lamborghini", 730.0, "double wishbone rear suspension", 250000.0);

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
    }
}
