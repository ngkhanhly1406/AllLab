using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace project3
{
    class Program
    {
        static void Main(string[] args)
        {
            // khai báo tham chiếu đối tượng Cả có tên myCar
            Car myCar;
            //// tạo một đối tượng Car và gán địa chỉ của nó cho myCar
            System.Console.WriteLine("Creating a car object and assigning" + "its memory location to myCar ");
            myCar = new Car();

            //gán giá trị cho các trường của đối tượng Car bằng myCar
            myCar.make = "Toyota";
            myCar.model = "MR2";
            myCar.color = "black";
            myCar.yearBuilt = 1995;

            //hiển thị các giá trị trường bằng myCar
            System.Console.WriteLine("myCar details:");
            System.Console.WriteLine("myCar.make = " + myCar.make);
            System.Console.WriteLine("myCar.model= " + myCar.model);
            System.Console.WriteLine("myCar.color = " + myCar.color);
            System.Console.WriteLine("myCar.yearBuilt=" + myCar.yearBuilt);

            //// gọi các phương thức sử dụng myCar
            myCar.Start();
            myCar.Stop();

            // khai báo một tham chiếu đối tượng Car khác và
            // tạo một đối tượng Xe hơi khác

            System.Console.WriteLine("Creating another Car object and " + "assigning its memory location to rrredPorsche");
            Car redPorsche = new Car();
            redPorsche.make = "Porsche";
            redPorsche.model = "Boxster";
            redPorsche.color = "red";
            redPorsche.yearBuilt = 2000;
            System.Console.WriteLine("redPorsche is a " + redPorsche.model);


            // thay đổi đối tượng được tham chiếu bởi đối tượng myCar 
            // tham chiếu tới đối tượng được tham chiếu bởi redPorshe

            System.Console.WriteLine("Assignning redPorsche to myCar");
            myCar = redPorsche;
            System.Console.WriteLine("myCar details:");

            System.Console.WriteLine("myCar.make = " + myCar.make);
            System.Console.WriteLine("myCar.model = " + myCar.model);
            System.Console.WriteLine("myCar.color = " + myCar.color);
            System.Console.WriteLine("myCar.yearBuilt = " + myCar.yearBuilt);
            // gán null cho myCar myCar sẽ không còn tham chiếu              một đối tượng nữa
            myCar = null;
            Console.ReadLine();
        }



    }
}

