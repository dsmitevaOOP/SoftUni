using System;
using System.Text;

public class Component
{
	private string name = null;
	private string details = null;
	private double price = 0;

	public string Name
	{
		get
		{
			return this.name;
		}

		private set
		{
			if (value != null)
			{
				this.name = value;
			}
			else
			{
				throw new ArgumentNullException ( "Name cannot be empty!" );
			}
		}
	}

	public string Details
	{
		get
		{
			return this.details;
		}

		private set
		{
			if (value != null)
			{
				this.details = value;
			}
			else
			{
				throw new ArgumentNullException ( "Details cannot be empty!" );
			}
		}
	}

	public double Price
	{
		get
		{
			return this.price;
		}

		private set
		{
			if (value >= 0)
			{
				this.price = value;
			}
			else
			{
				throw new ArgumentOutOfRangeException ( "Price cannot be negative!" );
			}
		}
	}

	public Component ( string name, double price )
	{
		this.Name = name;
		this.Price = price;
	}

	public Component ( string name, double price, string details = null )
		: this ( name, price )
	{
		this.Details = details;
	}

	public override string ToString ()
	{
		StringBuilder comp = new StringBuilder ();

		comp.Append ( String.Format ( "name: {0}; price: {1:0.00}; ", this.Name, this.Price ) );
		comp.Append ( "details: " );

		if (this.Details != null)
		{
			comp.Append ( this.Details + "\n" );
		}
		else
		{
			comp.Append ( "not stated;\n" );
		}

		return comp.ToString ();
	}
}