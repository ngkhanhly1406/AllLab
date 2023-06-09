using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Project1
{
    class Button : Window
    {

        public Button(int top, int left) : base(top, left)
        {
        }
        // một phiên bản bị ghi đè (lưu ý từ khóa) bởi vì trong 
        // phương thức dẫn xuất, chúng tôi thay đổi hành vi
        public override void DrawWindow()
        {
            Console.WriteLine("Drawing a button at {0}, {1}\n", top, left);
        }
    }
}

