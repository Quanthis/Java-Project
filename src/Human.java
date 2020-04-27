public class Human
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

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
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

    public void setCar(Car car)
    {
        this.car = car;
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
}