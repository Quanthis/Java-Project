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
    }
}
