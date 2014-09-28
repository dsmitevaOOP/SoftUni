using System;

public class Battery
{
	private string type;
	private int mah;
	private int cells;

	public string Type
	{
		get
		{
			return this.type;
		}

		private set
		{
			if (value != null)
			{
				this.type = value;
			}
			else
			{
				throw new ArgumentNullException ( "Battery type cannot be empty!" );
			}
		}
	}

	public int Mah
	{
		get
		{
			return this.mah;
		}

		private set
		{
			if (value >= 0)
			{
				this.mah = value;
			}
			else
			{
				throw new ArgumentOutOfRangeException ( "mah cannot be ngeative!" );
			}
		}
	}

	public int Cells
	{
		get
		{
			return this.cells;
		}

		private set
		{
			if (value >= 0)
			{
				this.cells = value;
			}
			else
			{
				throw new IndexOutOfRangeException ( "Cells cannot be negative!" );
			}
		}
	}

	public Battery ( string type, int cells, int mah )
	{
		this.Type = type;
		this.Cells = cells;
		this.Mah = mah;
	}

	public override string ToString ()
	{
		return String.Format ( "type: {0}, {1}-cells, {2} mAh", this.Type, this.Cells, this.Mah );
	}
}