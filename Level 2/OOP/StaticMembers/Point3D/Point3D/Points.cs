using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Points
{
	static void Main ()
	{
		List<Point> points = new List<Point> () 
		{
			new Point (-25, 2, 3),
			new Point (-15, 4, 5),
			new Point (7, 22, 36),
			new Point (-205, 55, 34),
			new Point (20, 20, 30),
			new Point (7, 28, 33),
			new Point (-5, -2, -3),
			new Point (-85, 4, -3),
			new Point (56, -22, 12),
			new Point (9, 12, -13),
		};

		points.ForEach ( o => Console.WriteLine ( o.ToString () ) );
		Console.WriteLine ();
		Console.WriteLine ("This is a static field");
		Console.WriteLine ( Point.StartingPoint.ToString () );

		Point first = new Point ( 1, 5, 25 );
		Point second = new Point ( 54, 25, 15 );

		Console.WriteLine (DistanceCalculator.CalculateDistance(first, second));

		Path paths = new Path ( new Point ( -25, 2, 3 ), new Point ( -25, 2, 3 ), new Point ( -25, 2, 3 ) );

		Storage.Save ( "E:\\Dilyana\\SoftUni\\Level 2\\OOP\\StaticMembers\\Point3D\\Point3D\\save.txt", paths );

		Console.WriteLine();

		//loaded text
		List<Path> path = Storage.LoadPaths("E:\\Dilyana\\SoftUni\\Level 2\\OOP\\StaticMembers\\Point3D\\Point3D\\save.txt");

		path.ForEach(o => Console.WriteLine(o.ToString()));
	}
}

