import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Animal
{
    private String name;
    private File pic;
    public  final String species;
    BigDecimal weigth;
    private  boolean isAlive = true;

    Animal( String nameC,  File pictureC, String species, BigDecimal weight)
    {
        name = nameC;
        pic = pictureC;
        this.species = species;
        this.weigth = weight;
    }

    Animal( String nameC,  File pictureC, String species)
    {
        name = nameC;
        pic = pictureC;
        this.species = species;
        if(species == "Blablador")
        {
            this.weigth = new BigDecimal(20.0);
        }
        else if(species == "Sheepkeeper")
        {
            this.weigth = new BigDecimal(25.0);
        }
        else if(species == "Shopkeeper")
        {
            this.weigth = new BigDecimal(30.0);
        }
        else
        {
            this.weigth = new BigDecimal(5.0);
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String nameM)
    {
        name = nameM;
    }

    public File getPic()
    {
        return pic;
    }

    public void setPic(File pic2)
    {
        pic = pic2;
    }

    public  void feed()
    {
        weigth.subtract(new BigDecimal(1));
        System.out.println("Food eaten, animal weight's now: " + weigth);
    }

    public void goForWalk(Double distance)
    {
        while(distance > 0)
        {
            System.out.println("Distance to make: " + distance);
            --distance;

            weigth = weigth.subtract(new BigDecimal(1));
            weigth = weigth.setScale(2, RoundingMode.HALF_UP);
            System.out.println(weigth);

            isHungry();
            if(!animalState()) break;
        }
        System.out.println("Weight after walk: " + weigth);
    }

    public void isHungry()
    {
        if (weigth.doubleValue() <= 5.0 && animalState())
        {
            System.out.println("I'm hungry");
            return;
        }
        System.out.println("I'm not hungry");
    }

    public boolean animalState()
    {
        if (weigth.doubleValue() <= 0)
        {
            System.out.println("Animal is dead");
            isAlive = false;
            return false;
        }
        System.out.println("Animal lives... yet");
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", pic=" + pic +
                ", species='" + species + '\'' +
                ", weigth=" + weigth +
                ", isAlive=" + isAlive +
                '}';
    }
}