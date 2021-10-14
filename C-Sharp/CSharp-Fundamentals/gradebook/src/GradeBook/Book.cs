using System;
using System.Collections.Generic;
namespace GradeBook
{
    public class Book
    {
        // 📌Fields: in fields default is private but its helpful to not be implicit here
        private List<double> grades;

        // 📌 in C# .NET  the convention for a public members is to use and uppercase,
        public string Name;

        // 📌Constructor
        public Book(string name)
        {
            // 📌 in C# .NET  the convention for a public members is to use and uppercase, this lets you do away with "this.name = name " in the constructor
            Name = name;
            grades = new List<double>();
        }

        // 📌Class Methods
        public void AddGrade(double grade)
        {
                grades.Add(grade);
        }
        public Statistics GetStatistics()
        {
            var result = new Statistics();
            result.Average = 0.0;
            result.High = double.MinValue;
            result.Low = double.MaxValue;
            foreach (double grade in grades)
            {
                result.High = Math.Max(grade, result.High);
                result.Low = Math.Min(grade, result.Low);
                result.Average += grade;
            }
            result.Average /= grades.Count;

            return result;
        }
    }
}