using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

public static class Storage
{
	public static void Save ( string fileName, Path path )
	{
		try
		{
			using (StreamWriter sw = new StreamWriter ( fileName ))
			{
				sw.WriteLine ( path.ToString () );
			}
		}
		catch (Exception ex)
		{
			Console.WriteLine ( ex.Message, ex.StackTrace );
			throw ex.InnerException;
		}
	}

	public static List<Path> LoadPaths ( string fullFilename )
	{
		try
		{
			List<Path> paths = new List<Path> ();
			using (StreamReader sr = new StreamReader ( fullFilename, Encoding.GetEncoding ( "UTF-8" ) ))
			{

				string line = sr.ReadLine ();
				while (line != null)
				{
					Path points = new Path ();
					var lines = line.Split ( new[] { ", " }, StringSplitOptions.RemoveEmptyEntries );
					foreach (var l in lines)
					{
						points.Add ( Point.DeSerialize ( l ) );
					}

					line = sr.ReadLine ();
					paths.Add ( points );
				}
			}
			return paths;

		}
		catch (Exception ex)
		{
			Console.WriteLine ( ex.Message );
			throw ex.InnerException;
		}
	}
}

