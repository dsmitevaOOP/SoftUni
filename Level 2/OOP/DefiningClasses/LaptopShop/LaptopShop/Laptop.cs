using System;
using System.Text;

public class Laptop
{
	private string model = null;
	private string manufacturer = null;
	private string processor = null;
	private int ramGB = 0;
	private string graphicsCard = null;
	private string hdd = null;
	private string screen = null;
	private Battery battery = null;
	private double batteyLife = 0;
	private double price = 0;

	public string Model
	{
		get
		{
			return this.model;
		}

		private set
		{
			if (value != null)
			{
				this.model = value;
			}

			else
			{
				throw new ArgumentNullException ( "Model cannnot be empty!" );
			}
		}
	}

	public string Manufacturer
	{
		get
		{
			return this.manufacturer;
		}

		private set
		{
			if (value != null)
			{
				this.manufacturer = value;
			}
			else
			{
				throw new ArgumentNullException ( "Manufacturer cannot be emty!" );
			}
		}
	}

	public string Processor
	{
		get
		{
			return this.processor;
		}

		private set
		{
			if (value != null)
			{
				this.processor = value;
			}
			else
			{
				throw new ArgumentNullException ( "Processor cannot be empty!" );
			}
		}
	}

	public int RamGB
	{
		get
		{
			return this.ramGB;
		}

		private set
		{
			if (value >= 0)
			{
				this.ramGB = value;
			}
			else
			{
				throw new ArgumentOutOfRangeException ( "RAM cannot be negative!" );
			}
		}
	}

	public string GraphicsCard
	{
		get
		{
			return this.graphicsCard;
		}

		private set
		{
			if (value != null)
			{
				this.graphicsCard = value;
			}
			else
			{
				throw new ArgumentNullException ( "Graphics Card cannot be empty!" );
			}
		}
	}

	public string Hdd
	{
		get
		{
			return this.hdd;
		}

		private set
		{
			if (value != null)
			{
				this.hdd = value;
			}
			else
			{
				throw new ArgumentNullException ( "HDD cannot be empty!" );
			}
		}
	}

	public string Screen
	{
		get
		{
			return this.screen;
		}

		private set
		{
			if (value != null)
			{
				this.screen = value;
			}
			else
			{
				throw new ArgumentNullException ( "Screen cannot be empty!" );
			}
		}
	}

	public Battery Battery
	{
		get
		{
			return this.battery;
		}

		private set
		{
			if (value != null)
			{
				this.battery = value;
			}
			else
			{
				throw new ArgumentNullException ( "Battery cannot be empty!" );
			}
		}
	}

	public double BatteryLife
	{
		get
		{
			return this.batteyLife;
		}

		private set
		{
			if (value >= 0)
			{
				this.batteyLife = value;
			}
			else
			{
				throw new ArgumentOutOfRangeException ( "Battery life cannot be negative!" );
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

	public Laptop ( string model, double price )
	{
		this.Model = model;
		this.Price = price;
	}

	public Laptop ( string model, double price, string manufacturer = null, string processor = null, int ramGB = 0, string graphicsCard = null, string hdd = null, string screen = null, Battery battery = null, double batteryLife = 0 )
		: this ( model, price )
	{
		this.Manufacturer = manufacturer;
		this.Processor = processor;
		this.RamGB = ramGB;
		this.Hdd = hdd;
		this.GraphicsCard = graphicsCard;
		this.Battery = battery;
		this.Screen = screen;
	}

	public override string ToString ()
	{
		StringBuilder laptop = new StringBuilder ();

		laptop.Append ( String.Format ( "model: {0}\n", this.Model ) );
		laptop.Append ( "manufacturer: " );

		if (this.Manufacturer != null)
		{
			laptop.Append ( this.Manufacturer + "\n" );
		}
		else
		{
			laptop.Append ( "not stated\n" );
		}

		laptop.Append ( "processor: " );

		if (this.Processor != null)
		{
			laptop.Append ( this.Processor + "\n" );
		}
		else
		{
			laptop.Append ( "not stated\n" );
		}

		laptop.Append ( String.Format ( "RAM: {0} GB\n", this.RamGB ) );

		laptop.Append ( "graphics card: " );

		if (this.GraphicsCard != null)
		{
			laptop.Append ( this.GraphicsCard + "\n" );
		}
		else
		{
			laptop.Append ( "not stated\n" );
		}

		laptop.Append ( "HDD: " );

		if (this.Hdd != null)
		{
			laptop.Append ( this.Hdd + "\n" );
		}
		else
		{
			laptop.Append ( "not stated\n" );
		}

		laptop.Append ( "screen: " );

		if (this.Screen != null)
		{
			laptop.Append ( this.Screen + "\n" );
		}
		else
		{
			laptop.Append ( "not stated\n" );
		}

		laptop.Append ( "battery: " );

		if (this.Battery != null)
		{
			laptop.Append ( this.Battery.ToString () + "\n" );
		}
		else
		{
			laptop.Append ( "not stated\n" );
		}

		laptop.Append ( String.Format ( "Battery Life: {0}h\n", this.BatteryLife ) );

		laptop.Append ( String.Format ( "price: {0:0.00}\n", this.Price ) );

		return laptop.ToString ();
	}
}

