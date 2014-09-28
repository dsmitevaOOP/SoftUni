using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HTMLDispatcher
{
	class Dispatcher
	{
		static void Main ( )
		{
			ElementBuilder eb = new ElementBuilder("body");
			Console.WriteLine(	eb.ToString());
			eb.AddAtribute("class", "ssd");
			Console.WriteLine ( eb.ToString () );
			eb.AddContent("dfdfd");
			Console.WriteLine(eb.ToString()	);
			eb.AddAtribute ( "class", "ssd" );
			Console.WriteLine ( eb.ToString () );
			ElementBuilder eb1 = new ElementBuilder("body");

			string my = eb1*5;
			Console.WriteLine(my);
		}
	}
}
