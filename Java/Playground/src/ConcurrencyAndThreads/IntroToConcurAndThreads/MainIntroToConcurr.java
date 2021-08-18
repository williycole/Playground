package ConcurrencyAndThreads.IntroToConcurAndThreads;

import static ConcurrencyAndThreads.IntroToConcurAndThreads.ThreadColor.*;

/*
 * In Java each application(or process) is run on its own heap(its own memory space),
 * heaps are not shared between applications and each application or process has its own thread(s).
 * Threads are a unit of execution within a process, just about every java process has multiple system threads,
 * each thread has its own thread stack which only that thread can process.
 *
 * --> Every Java App has a single process, each process can have multiple threads.
 * --> Every process has a heap, and every thread has a thread stack.
 * using multiple threads help you to do other task while a long task is running,
 * ie long task on another thread other than the MiscPuzzles.ShiftToLeft thread
 * APIs sometimes require you to use another thread
 *
 * Concurrency - an application doing more than one thing at a time. This doesn't necessarily mean the application
 * is doing more than one thing at a time. It means that progress can be made on more than one task at a time.
 * */
public class MainIntroToConcurr {
    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Yo from the MiscPuzzles.ShiftToLeft thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        //below is an anonymous thread
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous thread");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_GREEN + "AnotherThread terminated, so I'm running again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_GREEN + "I couldn't wait after all. I was interrupted.");
                }
            }
        }.start();

        /*
        Runnable Thread, you can also do this anonymously like below
        or not anonymously from the class but anonymously is more
        common and more flexible
         */

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
//                super.run();
                System.out.println(ANSI_PURPLE + "Hello from the anonymous class thread");
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ANSI_RED + "Yo again from the MiscPuzzles.ShiftToLeft thread");
    }


}
