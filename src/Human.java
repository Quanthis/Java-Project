public class Human {
    private String name;
    private String surname;
    private Double age;
    private Integer id;
    private Phone number;

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
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

}