package Creatures;

import java.math.BigDecimal;
import java.io.File;

public class FarmAnimal extends Animal implements Edible
{
    public FarmAnimal(String name, File pic, String species, BigDecimal weigth)
    {
        super(name, pic, species, weigth);
    }

    @Override
    public void beEaten()
    {
        if (this.isAlive)
        {
            System.out.println(this.getName() + "has been eaten.");
            isAlive = false;
        }
        else System.out.println("This animal can't be eaten.");
    }
}
