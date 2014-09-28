using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EnterNumbers
{
	class EnterNumbers
	{
		static void Main ()
		{
			int start = 1;
			int end = 100;
			int num;

			for (int i = 0; i < 10; i++)
			{
				num = ReadNumber ( start, end );
			}
		}
		static int ReadNumber ( int start, int end )
		{
			int number = 0;
			bool isNum;

			try
			{
				Console.WriteLine("Enter number between {0} and {1}: ", start, end);
				isNum = int.TryParse(
					Console.ReadLine(), out number);

				if (!isNum)
				{
					Console.WriteLine("Enter number between {0} and {1}: ", start, end);
					throw new FormatException("Invalid number!");
				}

				if (number < start || number > end)
				{
					throw new ArgumentOutOfRangeException(String.Format("Your number is not in range {0} - {1} !", start, end));
				}
			}
			catch (FormatException)
			{								
				Console.WriteLine("Invalid Number!");
				isNum = int.TryParse(
					Console.ReadLine(), out number);

				while (!isNum)
				{
					Console.WriteLine("Invalid number");
					Console.WriteLine("Enter number between {0} and {1}: ", start, end);
					isNum = int.TryParse(
						Console.ReadLine(), out number);
				}
			}
			catch (ArgumentOutOfRangeException)
			{
				while (number < start || number > end)
				{
					Console.WriteLine("Your number is not in range {0} - {1} !", start, end);
					Console.WriteLine("Enter number between {0} and {1}: ", start, end);
					number = int.Parse(Console.ReadLine());
				}
			}
			return number;
		}
	}
}
