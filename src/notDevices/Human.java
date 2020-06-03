package notDevices;

import Creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;

public class Human implements Saleable
{
    private String name;
    private String surname;
    private Double age;
    private Integer id;
    private Phone number;
    private Animal pet;
    private Car[] garage;
    private Double salary = 0.0;
    static  int index = 0;
    private  Double cash;

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
    }

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, double salary)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        this.salary = salary;
    }

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, Animal animal)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        pet = animal;
    }

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, Car car)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        this.garage = new Car[1];
        this.garage[0] = car;
    }

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, Car car, Animal pet)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        this.garage = new Car[1];
        this.garage[0] = car;
        this.pet = pet;
    }

    public  Human(String name, Car car, Double cash)
    {
        this.name = name;
        this.garage = new Car[1];
        this.garage[0] = car;
        this.cash = cash;
    }

    public Human(String name, int garageSize, Double cash)
    {
        if(garageSize >= 0)
        {
            this.name = name;
            this.garage = new Car[garageSize];
            this.cash = cash;
        }
        else
        {
            System.out.println("You cannot have negative amount of cars, as far I know.");
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

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surnameM)
    {
        surname = surnameM;
    }

    public Double getAge()
    {
        return age;
    }

    public void setAge(Double ageM)
    {
        age = ageM;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer idM)
    {
        id = idM;
    }


    public Phone getNumber()
    {
        return number;
    }

    public void setNumber(Phone numberM)
    {
        number = numberM;
    }

    public Car getCar(int parkingLotNo)
    {
        return garage[parkingLotNo];
    }

    public Double getCash() {return  cash;}

    public Animal getAnimal(){return  pet;}

    public void removeAnimal()
    {
        this.pet = null;
    }

    public  void addAnimal(Animal animal)
    {
        this.pet = animal;
    }

    public  void minusCash(Double toPay)
    {
        this.cash = this.cash - toPay;
    }

    public  void plusCash(Double toGet)
    {
        this.cash = this.cash + toGet;
    }

    public void removeCar(Car soldCar, int parkingLotNo)
    {
        this.garage[parkingLotNo] = null;
    }

    public void addCar(Car boughtCar, int parkingLotNo)
    {
        this.garage[parkingLotNo] = boughtCar;
    }

    public void removePhone(Phone sold)
    {
        this.number = null;
    }

    public  void addPhone(Phone bought)
    {
        this.number = bought;
    }

    public void setCar(Car car, int parkingLotNo)
    {
        if(car.getWorth() < salary)
        {
            System.out.println("You've managed to buy this car.");
            this.garage[parkingLotNo] = car;
        }
        else if(car.getWorth() <= salary * 12)
        {
            System.out.println("You've managed to buy this car in installments.");
            this.garage[parkingLotNo] = car;
        }
        else
        {
            System.out.println("Sorry, you are too poor for this car.");
        }
    }

    public  double getSalary()
    {
        if(LastSalaryInfo.firsttime == true)
        {
            System.out.println("This is your first salary info someone is getting.");
            LastSalaryInfo.lastSalary = salary;
            LastSalaryInfo.firsttime = false;
            return  salary;
        }
        else
        {
            System.out.println("Last time your salary was changed it was equal to: " + LastSalaryInfo.lastSalary);
            LastSalaryInfo.lastSalary = salary;
            System.out.println("Now your salary is equal to: " + salary);
            return  salary;
        }
    }

    public  void setSalary(double newSalary)
    {
        if(newSalary < 0)
        {
            System.out.println("Don't you think this salary is a bit too low?");
        }
        else
        {
            System.out.println("Accounting system has been notified.");
            System.out.println("Remember to get anex from ms. Hanna from HR.");
            System.out.println("ZUS and US know about your income anyway, don't hide it in your garden.");
            this.salary = newSalary;
        }
    }

    public double getGarageValue()
    {
        double result = 0;
        for(int i = 0; i < garage.length; ++i)
        {
            result += garage[i].getWorth();
        }
        return result;
    }

    public void sortGarage_asc()
    {
        Arrays.sort(garage);
    }

    public Integer getFreeParkingLot()
    {
        for(int i = 0; i < garage.length; ++i)
        {
            if(garage[i] == null)
            {
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "notDevices.Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", number=" + number +
                ", pet=" + pet +
                ", car=" + garage +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    public String getGarage()
    {
        String result = "";
        for(int i = 0; i < garage.length; ++i)
        {
            result += "\n" + garage[i].toString();
        }
        return  result;
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price)
    {
        System.out.println("Too late for buying humans.");
    }
}