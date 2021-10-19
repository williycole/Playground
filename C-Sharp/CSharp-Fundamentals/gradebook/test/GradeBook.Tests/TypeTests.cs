using System;
using Xunit;

namespace GradeBook.Tests
{
    /*
    ⭐ Delegates Example
    📌 Delegates give you the ability to declare a variable that you can use like a method,
       its a variable that you can invoke and pass parameters
    */
    public delegate string WriteLogDelegate(string logMessage);
    public class TypeTests
    {
        int count = 0;
        [Fact]
        public void WriteLogDelegateCanPointToMethod()
        {
            WriteLogDelegate log = ReturnMessage;
            log += ReturnMessage;
            log += IncrementCount;

            var result = log("Hello");
            Assert.Equal("Hello", result);
        }
         string ReturnMessage(string message)
        {
            count++;
            return message.ToLower();
        }
        string IncrementCount(string message)
        {
            count++;
            return message.ToLower();
        }


        // 📌⭐ .NET Runtime has built in Garbage Collecitons
        [Fact]
        public void StringsBehaveLikeValueTypes()
        {
            string name = "Cole";
            // MakeUppercase returns a new string
            var upper = MakeUppercase(name);
            Assert.Equal("Cole", name);
            Assert.Equal("COLE", upper);
        }
        private string MakeUppercase(string parameter)
        {
            return parameter.ToUpper();
        }
        /*
        ⭐ Often this will not be needed in day to day programming
        📌 in C# the default is always always always pass by value
           unless you do the folloing, however.....
        📌 strings are always a reference type but, behave like value
           types as seen above
        📌 strings are immutable
        */
        [Fact]
        public void CSharpIsPassByRef()
        {
            // Arrange
            var book1 = GetBook("Book 1");
            GetBookSetNameRef(ref book1, "New Name");

            Assert.Equal("New Name", book1.Name);
        }
        private void GetBookSetNameRef(ref Book book, string name)
        {
            book = new Book(name);
        }


        [Fact]
        public void CanSetNameFromReference()
        {
            // Arrange
            var book1 = GetBook("Book 1");
            SetName(book1, "New Name");

            Assert.Equal("New Name", book1.Name);
        }
        private void SetName(Book book, string name)
        {
            book.Name = name;
        }


        [Fact]
        public void GetBookReturnsDifferentObjects()
        {
            // Arrange
            var book1 = GetBook("Book 1");
            var book2 = GetBook("Book 2");

            Assert.Equal("Book 1", book1.Name);
            Assert.Equal("Book 2", book2.Name);
            Assert.NotSame(book1, book2);
        }

        [Fact]
         public void TwoVarsCanReferenceSameObject()
        {
                    // Arrange
            var book1 = GetBook("Book 1");
            var book2 = book1;

            Assert.Same(book1, book2);
            Assert.True(Object.ReferenceEquals(book1, book2));
        }
           Book GetBook(string name)
        {
            return new Book(name);
        }
    }
}
