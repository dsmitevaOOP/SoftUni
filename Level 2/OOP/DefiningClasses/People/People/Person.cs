using System;

public class Person
{
	private string name;
	private int age;
	private string email;

	public string Name
	{
		get
		{
			return this.name;
		}

		set
		{
			if (string.IsNullOrEmpty ( value ) || value == "")
			{
				throw new ArgumentNullException ( "The name cannot be empty!" );
			}
			else
			{
				this.name = value;
			}
		}
	}

	public int Age
	{
		get
		{
			return this.age;
		}

		set
		{
			if (value < 1 || value > 100)
			{
				throw new IndexOutOfRangeException ( "Age should be in the range [1...100]" );
			}
			else
			{
				this.age = value;
			}
		}
	}

	public string Email
	{
		get
		{
			return this.email;
		}

		set
		{
			if (value != null && value.Contains ( "@" ) && value.Length > 1)
			{
				this.email = value;
			}
			else
			{
				this.email = null;
			}
		}
	}

	public Person ( string name, int age, string email )
	{
		this.Name = name;
		this.Age = age;
		this.Email = email;
	}

	public Person ( string name, int age )
		: this ( name, age, null )
	{

	}

	public override string ToString ()
	{
		return string.Format ( "name: {0}, age: {1}", this.Name, this.Age ) + (this.Email == null ? "" : ", email: " + this.Email);
	}
}

