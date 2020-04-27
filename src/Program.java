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
        doggo.goForWalk(15.0);
    }
}
