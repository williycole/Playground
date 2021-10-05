using System;
using static DoesContainDuplicates;

namespace Puzzles
{
    class Program
    {
        static void Main(string[] args)
        {
        IsIsogram("Dermatoglyphics");
        IsIsogram("isogram");
        IsIsogram("moose");
        IsIsogram("isIsogram");
        IsIsogram("aba");
        IsIsogram("moOse");
        IsIsogram("thumbscrewjapingly");
        IsIsogram("");
        IsIsogram("boot");
        }
    }
}
