using System;
using System.Collections.Generic;
/*
⭐ ((Pillers of OOP))
📌 🌟 Encapsulation --> hide details about our code
📌 Inheritance --> reuse code accrose similar classes
📌 Polymorphisim --> objects of the same type that behave differently
*/
namespace GradeBook
{
    // 🌟📌 Delegate
    public delegate void GradeAddedDelegate(object sender, EventArgs args);

    // ⭐ ((Base Classes))
    public abstract class Book : NamedObject, IBook
    {
        // ⭐ ((Derived from Base Class)) {NamedObject handles the getter and setter for Name}
        protected Book(string name) : base(name){ /*NoArgs Constructor*/ }
        public abstract event GradeAddedDelegate GradeAdded;
        public abstract void AddGrade(double grade);
        public abstract Statistics GetStatistics();
    }



    public class InMemoryBook : Book
    {
        // ⭐ ((Fields)) 📌 {fields default is private but its helpful to not be implicit here}
        private List<double> grades;
         /*
        ⭐ ((Events)) {and example of using delegates}
        📌 🌟object is the base type for everything in {.Net}
        📌 🌟 Event Delegate Standards {(first param) who is sending, (second param) event args}
        🌟 Public member of the book class for the delegates
        */
        public override event GradeAddedDelegate GradeAdded;
        //⭐ ((Constructor)) 📌 {here we use base name to pass our name to the NamedObject constructor that requries a Name}
        public InMemoryBook(string name) : base(name)
        {
            // 📌 in C# .NET the convention for a public members is to use and uppercase, this lets you do away with "this.name = name " in the constructor
            Name = name;
            grades = new List<double>();
        }

        // ⭐ ((Basic switch statements in C#)) 📌 {Method overloading example}

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

        // ⭐ ((Class Methods))
        public override void AddGrade(double grade)
        {
            if(grade <= 100 && grade >= 0)
            {
                grades.Add(grade);
                if( GradeAdded != null)
                {
                    GradeAdded(this, new EventArgs());
                }
            }
            else
            {
                throw new ArgumentException($"Invalid {nameof(grade)}");
            }
        }


        public override Statistics GetStatistics()
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

            // ⭐ ((C# Enhanced Switch Statments)) 📌 {have "Pattern Matching"}
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