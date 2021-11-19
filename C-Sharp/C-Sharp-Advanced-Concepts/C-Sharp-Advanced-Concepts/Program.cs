using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading;


namespace Misc
{
    public class Program
    {
        /*
         * |---------|
         * |LINQ Demo|
         * ---------------------------------------------------------------------------------------------------------
         * NOTES - thinks you can use with LINQ
         * -> From, Orderby, Select, IEnumerable, Inner Joins, Group Joins, Lambda, Where, ToList, Select, Zip, Aggregate, and Average
         *
         * You can use lamdas with delegates to do various calculations on the same thing
         */
        delegate double doubleIt(double val);

        static void QueryStringArray()
        {
            // Assign a Lambda to the delegate
            doubleIt dblIt = x => x * 2;
            Console.WriteLine($"5 * 2 = {dblIt(5)}");
            
            // Here we'll search through a list to 
            // find all the even numbers
            List<int> numList = new List<int> { 1,9,2,6,3 };
 
            // Put the number in the list if the 
            // condition is true
            var evenList = numList.Where(a => a % 2 == 0).ToList();
 
            foreach (var j in evenList)
                Console.WriteLine(j);
 
            // Add values in a range to a list
            var rangeList = numList.Where(x => (x > 2) || (x < 9)).ToList();
 
            foreach (var k in rangeList)
                Console.WriteLine(k);
            
            // Generate our list
            List<int> flipList = new List<int>();
            int i = 0;
            Random rnd = new Random();
            while (i < 100)
            {
                flipList.Add(rnd.Next(1, 3));
                i++;
            }
 
            // Print out the heads and tails
            Console.WriteLine("Heads : {0}",
                flipList.Where(a => a == 1).ToList().Count());
            Console.WriteLine("Tails : {0}",
                flipList.Where(a => a == 2).ToList().Count());
 
            // Find all names starting with s
            var nameList = new List<string> { "Doug", "Sally", "Sue" };
 
            var sNameList = nameList.Where(x => x.StartsWith("S"));
 
            foreach (var m in sNameList)
                Console.WriteLine(m);
 
            // ---------- SELECT ----------
            // Select allows us to execute a function 
            // on each item in a list
 
            // Generate a list from 1 to 10
            var oneTo10 = new List<int>();
            oneTo10.AddRange(Enumerable.Range(1, 10));
 
            var squares = oneTo10.Select(x => x * x);
 
            foreach (var l in squares)
                Console.WriteLine(l);
 
            // ---------- ZIP ----------
            // Zip applies a function to two lists 
            // Add values in 2 lists together
            var listOne = new List<int>(new int[] { 1, 3, 4});
            var listTwo = new List<int>(new int[] { 4, 6, 8});
 
            var sumList = listOne.Zip(listTwo, (x, y) => x + y).ToList();
 
            foreach (var n in sumList)
                Console.WriteLine(n);
 
            // ---------- AGGREGATE ----------
            // Aggregate performs an operation on 
            // each item in a list and carries the 
            // results forward 
 
            // Sum values in a list
            var numList2 = new List<int>() { 1, 2, 3, 4, 5 };
            Console.WriteLine("Sum : {0}", 
                numList2.Aggregate((a, b) => a + b));
 
            // ---------- AVERAGE ----------
            // Get the average of a list of values
            var numList3 = new List<int>() { 1, 2, 3, 4, 5 };
 
            // AsQueryable allows you to manipulate the
            // collection with the Average function
            Console.WriteLine("AVG : {0}", 
                numList3.AsQueryable().Average());
 
            // ---------- ALL ----------
            // Determines if all items in a list
            // meet a condition
            var numList4 = new List<int>() { 1, 2, 3, 4, 5 };
 
            Console.WriteLine("All > 3 : {0}", 
                numList4.All(x => x > 3));
 
            // ---------- ANY ----------
            // Determines if any items in a list
            // meet a condition
            var numList5 = new List<int>() { 1, 2, 3, 4, 5 };
 
            Console.WriteLine("Any > 3 : {0}",
                numList5.Any(x => x > 3));
 
            // ---------- DISTINCT ----------
            // Eliminates duplicates from a list
            var numList6 = new List<int>() { 1, 2, 3, 2, 3 };
 
            Console.WriteLine("Distinct : {0}",
                string.Join(", ", numList6.Distinct()));
 
            // ---------- EXCEPT ----------
            // Receives 2 lists and returns values not
            // found in the 2nd list
            var numList7 = new List<int>() { 1, 2, 3, 2, 3 };
            var numList8 = new List<int>() { 3 };
 
            Console.WriteLine("Except : {0}",
                string.Join(", ", numList7.Except(numList8)));
 
            // ---------- INTERSECT ----------
            // Receives 2 lists and returns values that
            // both lists have
            var numList9 = new List<int>() { 1, 2, 3, 2, 3 };
            var numList10 = new List<int>() { 2, 3 };
 
            Console.WriteLine("Intersect : {0}",
                string.Join(", ", numList9.Intersect(numList10)));
 
            Console.ReadLine();

            string[] dogs =
            {
                "K 9", "Brian Griffin",
                "Scooby Doo", "Old Yeller", "Rin Tin Tin",
                "Benji", "Charlie B. Barkin", "Lassie",
                "Snoopy"
            };


            var dogSpaces = from dog in dogs
                where dog.Contains(" ")
                orderby dog descending
                select dog;

            foreach (var j in dogSpaces)
            {
                Console.WriteLine(j);
            }

            Console.WriteLine();
        }

        static int[] QueryIntArray()
        {
            int[] nums = {5, 10, 15, 20, 25, 30, 35};

            // Get numbers bigger then 20
            var gt20 = from num in nums
                where num > 20
                orderby num
                select num;

            foreach (var i in gt20)
            {
                Console.WriteLine(i);
            }

            Console.WriteLine();

            // The type is an enumerable
            Console.WriteLine($"Get Type : {gt20.GetType()}");

            // You can convert it into a List or array
            var listGT20 = gt20.ToList<int>();
            var arrayGT20 = gt20.ToArray();

            // If you change the data the query 
            // automatically updates
            nums[0] = 40;

            foreach (var i in gt20)
            {
                Console.WriteLine(i);
            }

            Console.WriteLine();

            return arrayGT20;
        }

        static void Main(string[] args)
        {
            QueryStringArray();
            QueryIntArray();

            Console.WriteLine("\n");
            Console.WriteLine("\n");
            Console.WriteLine("\n");
            /*
             * |---------------|
             * |Enumerable Demo|
             * ---------------------------------------------------------------------------------------------------------
             * Enumeration: basically means go into a list and do something with every item in a list
             * enumerators work just like foreach or for loop but they do not have access to link, they
             *
             * USE: when your collection is a massive database table -> lets you load and work with data
             * piece wise instead of load and work with all the data at once
             * 
             * DON'T USE: when you need the results right away or are possibly mutating/editing the
             * objects later on, instead use a List or an Array
             * 
             * Example: say you have a data base of 1000 entries and can only grab 100 at a time, an enumerator
             * would let you grab the first 100 and search or do something to the data then move to the
             * next 100. Enumerators generate the results on the fly when asked for them.  
             */
            var infinateEnumerable = new IEnumerableProgram.MyInfinateEnumerable();
            foreach (var item in infinateEnumerable)
            {
                Console.WriteLine($"I is {item}");
            }

            Console.WriteLine("\n");
            Console.WriteLine("\n");
            Console.WriteLine("\n");
            /*
             * |---------------|
             * |Hash Table Demo|
             * ---------------------------------------------------------------------------------------------------------
             * HashTables: a collection of KV pairs where the Key is an indexer, and value
             * is accessed by the Key
             * 
             * Use: when you frequently retrieve objects from your collection and you
             * have a large collections, Hash Tables are O(1) "Constant" Time. 
             */
            var userInfoHash = new Hashtable();

            // Adding
            for (int i = 0; i < 10; i++)
            {
                userInfoHash.Add(i, $"user {i}");
            }

            // Removing
            if (userInfoHash.ContainsKey(4))
            {
                userInfoHash.Remove(4);
            }

            // Settings
            if (userInfoHash.ContainsKey(1) || userInfoHash.ContainsKey(5))
            {
                userInfoHash[1] = "replacementName";
                userInfoHash[5] = "replacementName";
            }

            // Looping
            foreach (DictionaryEntry entry in userInfoHash)
            {
                Console.WriteLine($"Key: {entry.Key} / Value: {entry.Value}");
            }

            Console.WriteLine("\n");
            Console.WriteLine("\n");
            Console.WriteLine("\n");
            /*
             * |-----------------|
             * |Multi Thread Demo|
             * ---------------------------------------------------------------------------------------------------------
             * NOTES
             * When to use multiple threads You use multiple threads to increase the responsiveness of your application
             * and to take advantage of a multiprocessor or multi-core system to increase the application's throughput.
             * Consider a desktop application, in which the primary thread is responsible for user interface elements
             * and responds to user actions. Use worker threads to perform time-consuming operations that, otherwise,
             * would occupy the primary thread and make the user interface non-responsive. You can also use a dedicated
             * thread for network or device communication to be more responsive to incoming messages or events.
             *
             * If your program performs operations that can be done in parallel, the total execution time can be
             * decreased by performing those operations in separate threads and running the program on a multiprocessor
             * or multi-core system. On such a system, use of multithreading might increase throughput along with the
             * increased responsiveness.
             */

            static void Print1()
            {
                for (int i = 0; i < 1000; i++)
                {
                    Console.Write($" Print1 Thread");
                }
            }

            Console.WriteLine("Hello World!");
            Thread t = new Thread(Print1);
            t.Start();
            for (int i = 0; i < 1000; i++)
            {
                Console.Write("___Main Thread___");
            }

            Console.ReadLine();
        }
    }

    class Animal
    {
        public string Name { get; set; }
        public double Weight { get; set; }
        public double Height { get; set; }
        public int AnimalID { get; set; }

        public Animal(string name = "No Name",
            double weight = 0,
            double height = 0)
        {
            Name = name;
            Weight = weight;
            Height = height;
        }

        public override string ToString()
        {
            return string.Format("{0} weighs {1}lbs and is {2} inches tall",
                Name, Weight, Height);
        }
    }

    class Owner
    {
        public string Name { get; set; }
        public int OwnerID { get; set; }
    }
}