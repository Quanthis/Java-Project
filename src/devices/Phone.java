package devices;

public class Phone extends Device
{
    private Integer number;
    private String net;
    private Integer dialling_code;
    private  boolean turnedOn = false;

    public Phone(Integer numberC, String netC, String model, String producer, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
        number = numberC;
        net = netC;
        dialling_code = -1;
    }

    /*public Phone(Integer numberC, String netC, Integer dialling_codeC)
    {
        number = numberC;
        net = netC;
        dialling_code = dialling_codeC;
    }*/

    public Phone(String model, String producer, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer numberM)
    {
        number = numberM;
    }

    public String getNet()
    {
        return net;
    }

    public void setNet(String net)
    {
        net = net;
    }

    public Integer getDialling_code()
    {
        return dialling_code;
    }

    public void setDialling_code(Integer dialling_codeM)
    {
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
    public void turnOn()
    {
        turnedOn = true;
    }
}