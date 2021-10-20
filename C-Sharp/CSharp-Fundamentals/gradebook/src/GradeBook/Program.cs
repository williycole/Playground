using System;
namespace GradeBook
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            ⭐⭐⭐ NOTES about Implicit Typing in C# ⭐⭐⭐
            🌟 ((ASP.Net Core is for serverside and Web development))
                ⭐NOTE--> Implicit typing does not work with fields
            📌  vars in C# are implicitly infered but you can't change the type like you could in JS
                var x = 34.1;
                var y = 10.3;

            📌  Below will throw an error like mentioned on line 9
                y = "";
                var result =  x + y;

            📌  Similarly you can see how you can let the C# compiler implicitly handle types in an array
                var numbers = new double[] { 12.7, 10.3, 6.11};
                var numbers = new[] {12.7, 10.3, 6.11, 4.1};

            📌  When using things outside of System "ctrl + ." while hovering over error will auto import as seen above on line 2
            📌  You can also use implicit typing here as well as seen below
                List<double> grades = new List<double>();
                var grades = new List<double>() {12.7, 10.3, 6.11, 4.1};

                var grades = new List<double>() {12.7, 10.3, 6.11, 4.1};
                grades.Add(56.1);

                var result = 0.0;
                var highGrade = double.MinValue;
                var lowGrade = double.MaxValue;
                foreach (double number in grades)
                {
                    highGrade = Math.Max(number, highGrade);
                    lowGrade = Math.Min(number, lowGrade);
                    result += number;
                }
             📌 result = result / grades.Count; same as below
                result /= grades.Count;
             📌 :N3 is a format specifier -> 3 digits after the decimal
                Console.WriteLine($"The average grade is {result:N3}, highest grade is, {highGrade} lowest grade is {lowGrade}");
            */

            var book = new InMemoryBook("Coles Grade Book");
            // 🌟📌 Event Delegate
            book.GradeAdded += OnGradeAdded;
            EnterGrades(book);
            var stats = book.GetStatistics();
            Console.WriteLine($"For the book named {book.Name}");
            Console.WriteLine($"Average is: {stats.Average:N3}");
            Console.WriteLine($"Highest Grade is: {stats.High}");
            Console.WriteLine($"Lowest Grade is: {stats.Low}");
        }


        private static void EnterGrades(IBook book)
        {
            while (true)
            {
                Console.WriteLine("Enter a grade or 'q' to quit.");
                var input = Console.ReadLine();
                if (input == "q")
                {
                    break;
                }

                try
                {
                    var grade = double.Parse(input);
                    book.AddGrade(grade);
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        // 🌟📌 Event Delegate
        static void OnGradeAdded(object sender, EventArgs e)
        {
            Console.WriteLine("A grade was added..\n");
        }
    }
}
