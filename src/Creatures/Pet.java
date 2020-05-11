package Creatures;

import java.math.BigDecimal;
import java.io.File;

public class Pet extends  Animal
{
    public Pet(String name, File pic, String species, BigDecimal weigth)
    {
        super(name, pic, species, weigth);
    }

    public Pet(String name, File pic, String species)
    {
        super(name, pic, species);
    }
}
