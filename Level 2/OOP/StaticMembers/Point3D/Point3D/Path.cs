using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Path
{
	private IList<Point> paths;

	public IList<Point> Paths
	{
		get
		{
			return this.paths;
		}

		private set
		{
			if (value != null)
			{
				this.paths = value;
			}
			else
			{
				throw new ArgumentNullException ( "Cannot read from empty list!" );
			}
		}
	}

	public int Count
	{
		get
		{
			return this.Paths.Count;
		}
	}

	public Point this[int index]
	{
		get
		{
			return this.Paths[index];
		}

		set
		{
			if (value != null)
			{
				this.Paths[index] = value;
			}
			else
			{
				throw new ArgumentNullException ( "Value cannot be empty!" );
			}
		}
	}

	public Path ( params Point[] points )
	{
		this.Paths = points.ToList ();
	}

	public void Add ( Point p )
	{
		this.Paths.Add ( p );
	}

	public override string ToString ()
	{
		StringBuilder pathsSB = new StringBuilder ();
		for (int i = 0; i < this.Count; i++)
		{
			pathsSB.Append ( this[i].ToString () );
			if (i != this.Count - 1) { pathsSB.Append ( ", " ); }
		}
		return pathsSB.ToString ();
	}

}
