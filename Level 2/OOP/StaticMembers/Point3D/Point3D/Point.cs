using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

public class Point
{
	private static Point startingPoint = new Point (0, 0, 0);

	private double x;
	private double y;
	private double z;

	public static Point StartingPoint
	{
		get
		{
			return Point.startingPoint;
		}
	}

	public double X
	{
		get
		{
			return this.x;
		}

		private set
		{
			this.x = value;
		}
	}
	public double Y
	{
		get
		{
			return this.y;
		}

		private set
		{
			this.y = value;
		}
	}

	public double Z
	{
		get
		{
			return this.z;
		}

		private set
		{
			this.z = value;
		}
	}

	public Point ( double x, double y, double z )
	{
		this.X = x;
		this.Y = y;
		this.Z = z;
	}

	public override string ToString ()
	{
		return String.Format ( "{{ {0:F},{1:F},{2:F} }}", this.X.ToString (), this.Y.ToString (), this.Z.ToString () );
	}

	public static Point DeSerialize ( string pointStr )
	{
		Regex rgx = new Regex ( @"{(.+?),(.+?),(.+?)}" );
		MatchCollection matches = rgx.Matches ( pointStr );
		var g = (matches[0] as Match).Groups;
		Point point = new Point ( double.Parse ( g[1].Value ), double.Parse ( g[2].Value ), double.Parse ( g[3].Value ) );

		return point;
	}
}

