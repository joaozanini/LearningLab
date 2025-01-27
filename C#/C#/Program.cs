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


            Array numeros = Array.CreateInstance(typeof(int), 5);
            numeros.SetValue(2, 0);
            numeros.SetValue(1, 1);
            numeros.SetValue(3, 2);
            numeros.SetValue(10, 3);
            numeros.SetValue(5, 4);

            Array.Sort(numeros);
            for (int i = 0; i < numeros.Length; i++)
            {
                Console.WriteLine(numeros.GetValue(i));
            }

            if (numeros.Length % 2 == 0)
            {
                // Caso de tamanho par: média dos dois elementos centrais
                int val1 = (int)numeros.GetValue(numeros.Length / 2 - 1);
                int val2 = (int)numeros.GetValue(numeros.Length / 2);
                int mediana = (val1 + val2) / 2;
                Console.WriteLine("Mediana: " + mediana);
            }
            else
            {
                // Caso de tamanho ímpar: elemento central
                int mediana = (int)numeros.GetValue(numeros.Length / 2);
                Console.WriteLine("Mediana: " + mediana);
            }

            Console.Read();
        }
    }
}
