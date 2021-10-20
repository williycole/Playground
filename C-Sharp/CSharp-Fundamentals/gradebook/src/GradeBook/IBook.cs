namespace GradeBook
{
     // 🌟((Interface))📌{ contain no implementation details, just describes the available members}
        public interface IBook
        {
            void AddGrade(double grade);
            Statistics GetStatistics();
            string Name {get;}
            event GradeAddedDelegate GradeAdded;
        }
}