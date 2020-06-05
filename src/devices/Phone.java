package devices;

import notDevices.Application;
import notDevices.Human;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Phone extends Device
{
    private Integer number;
    private String net;
    private Integer dialling_code;
    private boolean turnedOn = false;
    private static final String addres = "localhost.7742";
    private static final String installProtocol = "ABDFGDFG7679";
    private static final String appVersion = "newest";

    private LinkedList<Application> InstalledApps = new LinkedList<Application>();

    public Phone(Integer numberC, String netC, String model, String producer, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
        number = numberC;
        net = netC;
        dialling_code = -1;
    }

    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer numberM) {
        number = numberM;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        net = net;
    }

    public Integer getDialling_code() {
        return dialling_code;
    }

    public void setDialling_code(Integer dialling_codeM) {
        dialling_code = dialling_codeM;
    }

    @Override
    public String toString()
    {
        return "devices.Phone{" +
                "number=" + number +
                ", net='" + net + '\'' +
                ", dialling_code=" + dialling_code +
                ", turned on = " + turnedOn + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        turnedOn = true;
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price)
    {
        if (seller.getNumber() == this)
        {
            if (buyer.getCash() >= price)
            {
                buyer.minusCash(price);
                seller.plusCash(price);
                seller.removePhone(this);
                buyer.addPhone(this);
                System.out.println("Transaction succeded!");
            }
            else System.out.println("Sorry, transaction failed.");
        }
        else System.out.println("Sorry, transaction failed.");
    }


    public void installAnnApp(String appName)
    {
        InstalledApps.add(new Application(appName));
    }

    public void installAnnApp(String appName, String appVersion)
    {
        InstalledApps.add(new Application(appName, appVersion));
    }

    public void installAnnApp(String appName, String appVersion, double price, Human buyer)
    {
        if (buyer.getCash() >= price)
        {
            InstalledApps.add(new Application(appName, appVersion, price));
            buyer.minusCash(price);
        }
        else
        {
            System.out.println("Sorry, you cannot afford this application: " + appName);
        }
    }

    public void installAnnApp(Application application, Human buyer)
    {
        if(buyer.getCash() >= application.getPrice())
        {
            InstalledApps.add(application);
        }
        else
            System.out.println("Sorry, you cannot afford this application: " + application.getName());
    }

    public void installAnnApp(String[] appNames)
    {
        for (var variable : appNames)
        {
            installAnnApp(variable);
        }
    }

    public boolean alreadyInstalled(Application application)
    {
        for (int i = 0; i < InstalledApps.size(); ++i)
        {
            if (InstalledApps.get(i) == application)
            {
                return true;
            }
        }
        return false;
    }

    public boolean alreadyInstalled(String applicationName)
    {
        for (int i = 0; i < InstalledApps.size(); ++i)
        {
            if (InstalledApps.get(i).getName() == applicationName)
            {
                return true;
            }
        }
        return false;
    }

    public void getFreeApps()
    {
        System.out.println("List of free apps installed on this phone: ");
        for (int i = 0; i < InstalledApps.size(); ++i)
        {
            if (InstalledApps.get(i).getPrice() == 0.0)
            {
                System.out.println(InstalledApps.get(i).toString());
            }
        }
    }

    public double getInstalledAppsValue()
    {
        System.out.println("Total value of applications installed on this device: ");

        double result = 0.0;
        for (int i = 0; i < InstalledApps.size(); ++i)
        {
            result += InstalledApps.get(i).getPrice();
        }

        return result;
    }

    public void sortAppsDesc()
    {
        Collections.sort(InstalledApps, new Comparator<Application>()
        {
            @Override
            public int compare(final Application object1, final Application object2)
            {
                return object1.getName().compareTo(object2.getName());
            }
        });

        System.out.println("Apps sorted alphabetically: ");

        for(int i = 0; i < InstalledApps.size(); ++i)
        {
            System.out.println(InstalledApps.get(i).toString());
        }
    }

    public void sortAppsByPrice()
    {
        Collections.sort(InstalledApps, new Comparator<Application>()
        {
            @Override
            public int compare(final Application object1, final Application object2)
            {
                return Double.compare(object1.getPrice(), object2.getPrice());
            }
        });

        System.out.println("Apps sorted by price: ");

        for(int i = 0; i < InstalledApps.size(); ++i)
        {
            System.out.println(InstalledApps.get(i).toString());
        }
    }
}