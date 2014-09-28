using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SquareRoot
{
	class SquareRoot
	{
		static void Main ()
		{
			try
			{
				Console.WriteLine ( "Enter a number:" );
				string num = Console.ReadLine ();

				int number;
				bool isNum = int.TryParse ( num, out number );

				if (!isNum)
				{
					throw new FormatException ( "Invalid number!" );
				}

				if (number < 0)
				{
					throw new ArgumentOutOfRangeException ( "The number should be greater or equal to 0!" );
				}

				double result = Math.Sqrt ( number );
				Console.WriteLine ( "Square root from: {0} is {1}", number, result );
			}
			catch (FormatException)
			{
				Console.WriteLine ( "Invalid number!" );
			}

			catch (ArgumentOutOfRangeException)
			{
				Console.WriteLine ( "Number should be positive!" );
			}
			finally
			{
				Console.WriteLine ( "Good bye!" );
			}
		}
	}
}
