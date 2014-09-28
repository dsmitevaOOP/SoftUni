using System;
using System.Collections.Generic;
using System.Linq;
class Persons
{
	static void Main ()
	{
		List<Person> persons = new List<Person> () 
		{
			new Person ("Pesho", 15),
			new Person ("Gosho", 20, "azSamGosho@gmail.com"),
			new Person ("Penka", 25, "babaPena@asdf.co.uk"),
		};

		persons.ForEach ( p => Console.WriteLine ( p.ToString () ) );
	}
}
