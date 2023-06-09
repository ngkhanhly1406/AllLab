using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Project1
{
    class ListBox : Window
    {
        // constructor thêm một tham số
            public ListBox(int top, int left, string contents)
               : base(top, left)// gọi hàm tạo cơ sở
            {
                listBoxContents = contents;
            }
            // một phiên bản bị ghi đè (lưu ý từ khóa) bởi vì trong 
            // phương thức dẫn xuất, chúng tôi thay đổi hành vi
            public override void DrawWindow()
            {
                base.DrawWindow(); // gọi phương thức cơ sở
                Console.WriteLine("Writing string to the listbox:{0}",
                    listBoxContents);
            }
            private string listBoxContents; // biến thành viên mới


        }
    }
