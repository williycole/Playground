using System;
using System.Collections;


namespace Misc
{
    public class Program
    {
        static void Main(string[] args)
        {
            // |---------------|
            // |Enumerable Demo|
            // |---------------|
            // var infinateEnumerable = new IEnumerableProgram.MyInfinateEnumerable();
            // foreach (var item in infinateEnumerable)
            // {
            //     Console.WriteLine($"I is {item}");
            // }
            //-------------------------------------------------------------------------
            // |---------------|
            // |Hash Table Demo|
            // |---------------|
            /* 
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
            
            
            
        }
    }
}