using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;

namespace HTMLDispatcher
{
	public static class HTMLDispatcher
	{
		public static string CreateImage(string src, string alt, string title)
		{
			ElementBuilder eb = new ElementBuilder("img");
			eb.AddAtribute ( "src", src );
			eb.AddAtribute ( "alt", alt );
			eb.AddAtribute ( "title", title );
			return eb.ToString();
		}

		public static string CreateInput (string type, string name, string value)
		{
			ElementBuilder eb = new ElementBuilder ( "input" );
			eb.AddAtribute ( "type", type );
			eb.AddAtribute ( "name", name );
			eb.AddAtribute ( "value", value );
			return eb.ToString ();
		}

		public static string CreateURL ( string url, string title, string text )
		{
			ElementBuilder eb = new ElementBuilder ( "url" );
			eb.AddAtribute ( "href", url );
			eb.AddAtribute ( "title", title );
			eb.AddContent ( text );
			return eb.ToString ();
		}
	}
}
