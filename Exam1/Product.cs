using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public abstract class Product
{
    protected string productId;
    protected string name;
    protected double price;
    protected string producer;

    public Product(string productId, string name, double price, string producer)
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.producer = producer;
    }

    public abstract double computeTax();
}

