using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam
{
    class Program
    {
        private static IEnumerable<Product> product;

        static void Main(string[] args)
        {
            Product[] products = new Product[6];
            products[0] = new Book("01", "Sách 1", 10.0, "Nhà xuất bản 1");
            products[1] = new Book("02", "Sách 2", 15.0, "Nhà xuất bản 2");
            products[2] = new Book("03", "Sách 3", 20.0, "Nhà xuất bản 3");
            products[3] = new MobilePhone("01", "Điện thoại 1", 100.0, "Hãng sản xuất 1");
            products[4] = new MobilePhone("02", "Điện thoại 2", 150.0, "Hãng sản xuất 2");
            products[5] = new MobilePhone("03", "Điện thoại 3", 200.0, "Hãng sản xuất 3");


            double totalBookTax = 0;
            double totalPhoneTax = 0;


            foreach (Product sp in product)
            {
                {
                    if (sp is Book book)
                    {
                        totalBookTax += book.ComputeTax();
                    }
                    else if (sp is MobilePhone mobilePhone)
                    {
                        totalPhoneTax += mobilePhone.ComputeTax();
                    }


                }
            }

            Console.WriteLine("total Book Tax is: " + totalBookTax);
            Console.WriteLine("total Mobile Phone Tax is: " + totalPhoneTax);
            double tongthue = totalBookTax + totalPhoneTax;
            Console.WriteLine("Tổng thuế các sản phẩm: " + tongthue);

            Console.ReadLine();

        }
    }
}




