package notDevices;

import devices.Car;
import devices.Phone;

public class Human implements Saleable
{
    private String name;
    private String surname;
    private Double age;
    private Integer id;
    private Phone number;
    private Animal pet;
    private Car car;
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
        this.car = car;
    }

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, Car car, Animal pet)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        this.car = car;
        this.pet = pet;
    }

    public  Human(String name, Car car, Double cash)
    {
        this.name = name;
        this.car = car;
        this.cash = cash;
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

    public Car getCar()
    {
        return car;
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

    public void removeCar(Car soldCar)
    {
        this.car = null;
    }

    public void addCar(Car boughtCar)
    {
        this.car = boughtCar;
    }

    public void removePhone(Phone sold)
    {
        this.number = null;
    }

    public  void addPhone(Phone bought)
    {
        this.number = bought;
    }

    public void setCar(Car car)
    {
        if(car.getWorth() < salary)
        {
            System.out.println("You've managed to buy this car.");
            this.car = car;
        }
        else if(car.getWorth() <= salary * 12)
        {
            System.out.println("You've managed to buy this car in installments.");
            this.car = car;
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

    @Override
    public String toString() {
        return "notDevices.Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", number=" + number +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price)
    {
        System.out.println("Too late for buying humans.");
    }
}