using System;
using System.Text;
using System.Collections.Generic;

public class Computer
{
	private string name = null;
	private double price = 0;
	private List<Component> components = null;

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

	public List<Component> Components
	{
		get
		{
			return this.components;
		}

		private set
		{
			if (value != null)
			{
				this.components = value;
			}
			else
			{
				throw new ArgumentNullException ( "Computer components can not be null!" );
			}
		}
	}

	public Computer ( string name, List<Component> components )
	{
		this.Name = name;
		this.Components = components;
		this.CalculatePrice ();
	}
	
	public string Display ()
	{
		StringBuilder comp = new StringBuilder ();

		comp.Append ( String.Format ( "name: {0};\nprice: {1:0.00};\n", this.Name, this.Price ) );
		comp.Append ( "components:\n" );

		if (this.Components != null)
		{		
			foreach (Component component in this.Components)
			{
				comp.Append ( component.ToString () );
			}
		}
		else
		{
			comp.Append ( "not stated;\n" );
		}

		return comp.ToString();
	}

	private void CalculatePrice ()
	{
		foreach (Component c in this.Components)
		{
			this.Price += c.Price;
		}
	}
}

