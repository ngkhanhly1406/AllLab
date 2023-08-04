using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam
{

    public class MobilePhone : Product
    {
        public MobilePhone(string productId, string name, double price, string producer)
              : base(productId, name, price, producer)

        { }

        public double Price { get; private set; }

        public override double ComputeTax()
        {
            return Price * 0.1;
        }
    }
}

