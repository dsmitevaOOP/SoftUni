using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public static class DistanceCalculator
{
	public static double CalculateDistance ( Point p, Point q )
	{
		return Math.Sqrt ( Math.Pow ( (q.X - p.X), 2 ) + Math.Pow ( (q.Y - p.Y), 2 ) + Math.Pow ( (q.Z - p.Z), 2 ) );
	}
}

