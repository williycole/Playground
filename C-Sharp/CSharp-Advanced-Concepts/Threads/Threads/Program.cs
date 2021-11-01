using System;
using System.Threading;

namespace Threads
{
    class Program
    {
        /*
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
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Thread t = new Thread(Print1);
            t.Start();
            for (int i = 0; i < 1000; i++)
            {
                Console.Write("___Main Thread___");
            }

            Console.ReadLine();
        }

        static void Print1()
        {
            for (int i = 0; i < 1000; i++)
            {
                Console.Write($" Print1 Thread");
            }
        }
    }
}