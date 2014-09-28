using System;

class LaptopShop
{
	static void Main ()
	{
		Battery bat = new Battery ( "Li-Ion", 4, 255 );
		Laptop laptop = new Laptop ( "Lenovo Yoga 2 Pro", 2259, "Lenovo", "Intel Core i5-4210U (2-core, 1.70 - 2.70 GHz, 3MB cache)", 8, "Intel HD Graphics 4400", "128GB SSD", "13.3\" (33.78 cm) – 3200 x 1800 (QHD+), IPS sensor display", bat, 4.5 );
		Console.WriteLine ( laptop.ToString () );

		Laptop first = new Laptop ( "HP 250 G2", 699 );
		Console.WriteLine ( first.ToString () );

	}
}

