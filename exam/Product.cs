using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam
{
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

        public abstract double ComputeTax();
    }
}

//


namespace Product
{
    public abstract class Product
    {
        protected string ProductId;
        protected string Name;
        protected double Price;
        protected string Producer;

        public Product(string productId, string name, double price, string producer)
        {
            ProductId = productId;
            Name = name;
            Price = price;
            Producer = producer;
        }
        public abstract double ComputeTax();
    }
}
