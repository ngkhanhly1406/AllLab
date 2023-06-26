using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam1
{
    class MobilePhone :Product
    {
        public MobilePhone(string productId, string name, double price, string producer) : base(productId, name, price, producer)
        {
        }

        public override double computeTax()
        {
            return price * 0.1;
        }
    }
}


