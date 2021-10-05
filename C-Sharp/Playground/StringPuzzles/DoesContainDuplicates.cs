using System;
using System.Linq;

public class DoesContainDuplicates
{
  public static bool IsIsogram(string str)
  {
    Console.WriteLine(str.Length == str.ToLower().Distinct().Count());
	 return str.Length == str.ToLower().Distinct().Count();
  }
}