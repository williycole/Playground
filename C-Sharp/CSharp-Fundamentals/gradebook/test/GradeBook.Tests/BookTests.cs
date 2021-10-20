// using System;
using Xunit;

namespace GradeBook.Tests
{
    public class BookTests
    {
        /*
        ⭐⭐NOTES References VS Values⭐⭐
         ⭐ ((Reference Types))
         📌 are pointers to where a variable(or other) lives on your computer.
            ex --> var b = new Book("Grades);

         ⭐ ((Value Types))
         📌 are stored directly in a variable(there is no reference)
         ex var x = 3;
        */
        [Fact]
        public void BookCalculatesAnAverageGrades()
        {
            // Arrange
            var book = new InMemoryBook("Coles Book");
            book.AddGrade(89.1);
            book.AddGrade(90.5);
            book.AddGrade(77.3);

            // Act
            var result = book.GetStatistics();

            // Assert
            Assert.Equal(85.6, result.Average, 1);
            Assert.Equal(90.5, result.High, 1);
            Assert.Equal(77.3, result.Low, 1);
            Assert.Equal('B', result.Letter);
        }
    }
}
