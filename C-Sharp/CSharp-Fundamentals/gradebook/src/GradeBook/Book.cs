using System;
using System.Collections.Generic;
namespace GradeBook
{
    public class Book
    {
        // 📌Fields: in fields default is private but its helpful to not be implicit here
        private List<double> grades;
        private string name;

        // 📌 in C# .NET  the convention for a public members is to use and uppercase,
        public string Name
        {
            // 📌 Properties, [getters, setters -> (the short and long way)]
            get; set;
            // 📌 can allso make them briave
            // private set;
            /*
            get
            {
                return name;
            }
            set
            {
                if(!String.IsNullOrEmpty(value))
                {
                    name = value;
                }
            }
            */
        }


        // 📌Constructor
        public Book(string name)
        {
            // 📌 in C# .NET  the convention for a public members is to use and uppercase, this lets you do away with "this.name = name " in the constructor
            Name = name;
            grades = new List<double>();
        }
        /*
        ⭐  📌 Basic switch statements in C#
            📌 Method overloading example
        */
        public void AddGrade(char letter)
        {
            switch (letter)
            {
                case 'A':
                    AddGrade(90);
                    break;
                case 'B':
                    AddGrade(80);
                    break;
                case 'C':
                    AddGrade(70);
                    break;
                default:
                    AddGrade(0);
                    break;
            }
        }

        // 📌Class Methods
        public void AddGrade(double grade)
        {
            if(grade <= 100 && grade >= 0)
            {
                grades.Add(grade);
            }
            else
            {
                // throw new ArgumentException($"Invalid {nameof(grade)}");
                throw new ArgumentException($"Invalid {nameof(grade)}");
            }
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
            /*
            ⭐ 📌C# Enhanced Switch Statments -> "Pattern Matching"
            */
            switch (result.Average)
            {
                case var d when d >= 90.0:
                    result.Letter = 'A';
                    break;
                case var d when d >= 80.0:
                    result.Letter = 'B';
                    break;
                case var d when d >= 70.0:
                    result.Letter = 'C';
                    break;
                case var d when d >= 60.0:
                    result.Letter = 'D';
                    break;
                default:
                    result.Letter = 'F';
                    break;
            }

            return result;
        }
    }
}