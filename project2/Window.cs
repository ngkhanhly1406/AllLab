using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Project1
{
    class Window
    {
        public Window(int top, int left)
        {
            this.top = top;
            this.left = left;
        }
        // mô phỏng vẽ cửa sổ
        public virtual void DrawWindow()
        {
            Console.WriteLine("Window: drawing Window at {0}, {1}",
                 top, left);
        }
        // các thành viên này được bảo vệ và do đó hiển thị 
        // đối với các phương thức của lớp dẫn xuất. Chúng ta sẽ xem xét điều này 
        // ở phần sau của chương
        protected int top;
        protected int left;
    }

}
 
