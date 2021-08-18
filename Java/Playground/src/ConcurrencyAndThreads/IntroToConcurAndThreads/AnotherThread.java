package ConcurrencyAndThreads.IntroToConcurAndThreads;

import static ConcurrencyAndThreads.IntroToConcurAndThreads.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
        try {
            Thread.sleep(3000);
//            System.out.println(ANSI_BLUE + "AnotherThread terminated, so I'm running again. ");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
