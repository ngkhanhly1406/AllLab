using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace project3
{
    class Car
    {
        // khai báo các trường
        public string make;
        public string model;
        public string color;
        public int yearBuilt;

        // định nghĩa các phương thức
        public void Start()
        {
            System.Console.WriteLine(model + " started");
        }
        public void Stop()
        {
            System.Console.WriteLine(model + "stopped");
        }
    }
}
