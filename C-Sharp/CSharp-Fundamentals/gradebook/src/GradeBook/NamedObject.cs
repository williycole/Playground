namespace GradeBook
{
    // ⭐ 📌 In .Net every class has a base class of Object or derives from Object
    public class NamedObject
    {
        // ⭐((Constructor))
        public NamedObject(string name)
        {
        // 📌 in C# .NET  the convention for a public members is to use and uppercase,
            Name = name;
        }

        /*
        ⭐ ((Getters and Setters))
        📌 there is also a longer/traditional way to do getters and setters
        📌 can allso make them priavte ex. private set;
        🌟 (Properties) 📌 like props in React, handles state
        */
        public string Name { get; set; }
    }
}