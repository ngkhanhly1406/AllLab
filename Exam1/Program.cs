﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam1
{
    class Program
    {
        static void Main(string[] args)
        {
            Product[] products = new Product[6];
            products[0] = new Book("01", "Sách 1", 10.0, "Nhà xuất bản 1");
            products[1] = new Book("02", "Sách 2", 15.0, "Nhà xuất bản 2");
            products[2] = new Book("03", "Sách 3", 20.0, "Nhà xuất bản 3");
            products[3] = new MobilePhone("01", "Điện thoại 1", 100.0, "Hãng sản xuất 1");
            products[4] = new MobilePhone("02", "Điện thoại 2", 150.0, "Hãng sản xuất 2");
            products[5] = new MobilePhone("03", "Điện thoại 3", 200.0, "Hãng sản xuất 3");

            double totalBookTax = 0, totalPhoneTax = 0;

            foreach (Product p in products)
            {
                if (p is Book book)
                {
                    totalBookTax += book.computeTax();
                }
                else if (p is MobilePhone mobilePhone)
                {
                    totalPhoneTax += mobilePhone.computeTax();
                }
            }

            Console.WriteLine("total Book Tax is: " + totalBookTax);
            Console.WriteLine("total Mobile Phone Tax is: " + totalPhoneTax);
            double totalTax = totalBookTax + totalPhoneTax;
            Console.WriteLine("total Tax is: " + totalTax);
            Console.ReadLine();
        }
    }
}