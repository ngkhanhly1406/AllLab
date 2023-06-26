namespace Exam1
{
    internal class Book :Product
    {
        public Book(string productId, string name, double price, string producer) : base(productId, name, price, producer)
        {
        }

        public override double computeTax()
        {
            return price * 0.08;
        }
    }

}
