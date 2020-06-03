package notDevices;

import java.util.Date;

public class Transaction
{
    private Human buyer;
    private Human seller;
    private double price;
    private Date date;

    public Transaction(Human buyer, Human seller, double price, Date date)
    {
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "Transaction{" +
                "buyer=" + buyer +
                ", seller=" + seller +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
