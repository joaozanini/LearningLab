using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, world"); // da pra escrever cw e apertar tab que faz o console.writeline
                // if not using System; System.Console.WriteLine("Hello, world");

            int age = 18;

            int idade;
            idade = 18;

            int x = 20, y = 10, z = 30;

            //cw(tipo.MaxValue); ou cw(tipo.MinValue)
            int integer = 1; // [int32]
            long longNum = 900000000000000000L; // [int64]
            double negative = -55.2D;
            float precision = -55.002F;
            decimal money = 14.99M;
            string name = "Joao";
            char letter = 'J';

            string textAge = "-23";
            int txtTo32value = Convert.ToInt32(textAge);

            Console.WriteLine($"Olá, {name}");
            Console.Read();

        }
    }
}
