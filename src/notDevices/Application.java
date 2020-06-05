package notDevices;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Application
{
    protected  String name;
    protected String version = "1.0";
    protected double price = 0.0;

    public  Application(String name)
    {
        this.name = name;
    }

    public Application(String name, String version)
    {
        this.name = name;
        this.version = version;
    }

    public Application(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public  Application(String name, String version, double price)
    {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Application{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", price=" + price +
                '}';
    }




}
