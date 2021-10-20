using System;
using Xunit;

namespace GradeBook.Tests
{
    /*
    ⭐ ((Delegates))
    📌 Essentially you can store methods in variables to pass as parameters to other methods

    ⭐ (DEFINITION)
    📌  delegate is a type that represents references to methods with a particular parameter list and return type.
         When you instantiate a delegate, you can associate its instance with any method with a compatible signature and
         return type. You can invoke (or call) the method through the delegate instance.
    📌  Delegates are used to pass methods as arguments to other methods. Event handlers are nothing more than methods that are
         invoked through delegates. You create a custom method, and a class such as a windows control can call your method when
         a certain event occurs. The following example shows a delegate declaration:
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
        private void GetBookSetNameRef(ref InMemoryBook book, string name)
        {
            book = new InMemoryBook(name);
        }


        [Fact]
        public void CanSetNameFromReference()
        {
            // Arrange
            var book1 = GetBook("Book 1");
            SetName(book1, "New Name");

            Assert.Equal("New Name", book1.Name);
        }
        private void SetName(InMemoryBook book, string name)
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
           InMemoryBook GetBook(string name)
        {
            return new InMemoryBook(name);
        }
    }
}
