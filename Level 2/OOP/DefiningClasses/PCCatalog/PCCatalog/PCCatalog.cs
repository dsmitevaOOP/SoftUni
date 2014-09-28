using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class PCCatalog
{
	static void Main ()
	{
		List<Computer> computers = new List<Computer> () {

			new Computer ( "Pesho", new List<Component> () 
			{
				new Component ("motherboard", 250),
				new Component ("processor", 350),
				new Component ("graphics card", 150),
				new Component ("screen", 200),
				new Component ("hdd", 220),
			} ),

			new Computer ( "Pesho", new List<Component> () 
			{
				new Component ("motherboard", 450),
				new Component ("processor", 550),
				new Component ("graphics card", 1150),
				new Component ("screen", 225),
				new Component ("hdd", 420),
			} ),

			new Computer ( "Pesho", new List<Component> () 
			{
				new Component ("motherboard", 150),
				new Component ("processor", 500),
				new Component ("graphics card", 1250),
				new Component ("screen", 235),
				new Component ("hdd", 470),
			} )
		};

		computers = computers.OrderBy ( o => o.Price ).ToList ();
		computers.ForEach ( o => Console.WriteLine ( o.Display () ) );
	}
}

