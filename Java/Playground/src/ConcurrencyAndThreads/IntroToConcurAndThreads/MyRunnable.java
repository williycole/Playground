package ConcurrencyAndThreads.IntroToConcurAndThreads;

import static ConcurrencyAndThreads.IntroToConcurAndThreads.ThreadColor.ANSI_PURPLE;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "Hello from MyRunnable Thread");
    }
}
