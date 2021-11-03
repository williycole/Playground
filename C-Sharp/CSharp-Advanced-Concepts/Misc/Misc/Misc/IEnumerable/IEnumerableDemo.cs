using System;
using System.Collections;
using System.Collections.Generic;

namespace Misc
{
    class IEnumerableProgram
    {
        /*
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

        public class MyInfinateEnumerable : IEnumerable<int>
        {
            private int[] myData = new[] {4, 5, 6};

            public IEnumerator GetEnumerator()
            {
                return new MyInfinateEnumerator();
            }

            IEnumerator<int> IEnumerable<int>.GetEnumerator()
            {
                return new MyInfinateEnumerator();
            }
        }

        public class MyInfinateEnumerator : IEnumerator<int>
        {
            public int Current { get; private set; } = 0;

            object IEnumerator.Current => Current;

            public void Dispose()
            {
            }

            public bool MoveNext()
            {
                Current++;

                while (Current < 100 + 1)
                {
                    return true;
                }

                return false;
            }

            public void Reset()
            {
                Current = 0;
            }
        }
    }
}