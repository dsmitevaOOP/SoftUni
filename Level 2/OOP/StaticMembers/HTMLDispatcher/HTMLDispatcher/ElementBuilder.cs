using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HTMLDispatcher
{
	public class ElementBuilder
	{
		private static string begin = "<";
		private static string end = ">";
		private static string endTag = "/";
		private static string sep = " ";

		private StringBuilder tag = new StringBuilder();

		public StringBuilder Tag
		{
			get { return this.tag; }

			private set
			{
				if (value != null)
				{
					this.tag = value;
				}
				else
				{
					throw new ArgumentNullException("Tag name cannot be empty!");
				}
			}
		}
		public ElementBuilder(string name)
		{
			this.Tag.Append(begin + name + end + begin + endTag + name + end);
		}

		public void AddAtribute(string attribute, string value)
		{
			string temp = String.Format("{0}=\"{1}\"", attribute, value);

			string tag = this.Tag.ToString ();

			for (int i = 0; i < tag.Length; i++)
			{
				if (tag.Substring ( i, 1 ) == end)
				{
					this.Tag.Insert ( i, sep + temp );
					break;
				}
			}
		}

		public void AddContent(string content)
		{
			string temp = this.Tag.ToString();

			for (int i = 0; i < temp.Length - 1; i++)
			{
				if (temp.Substring(i, 2) == end + begin)
				{
					this.Tag.Insert(i + 1, content);
				}
			}
		}

		public static string operator * ( ElementBuilder eb, int num )
		{
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < num; i++)
			{
				sb.Append(eb.ToString());
			}

			return sb.ToString();
		}				


		public override string ToString ()
		{
			return this.Tag.ToString();
		}
	}
}
