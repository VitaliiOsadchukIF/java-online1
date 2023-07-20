package module12;

import java.util.ArrayList;
import java.util.List;

public class Stopwatch  {
    public static void main(String[] args) {

        ProcessThread timeThread = new ProcessThread((n -> {
            if (n % 5 == 0 && n != 0) {
                System.out.println(n + " - Минуло 5 секунд");
            }
        } ));

        ProcessThread messageThread = new ProcessThread((n -> {
            if (n % 5 != 0) {
                System.out.println(n);
            }
        } ));

        List<ProcessThread> threads = new ArrayList<>();
        threads.add(timeThread);
        threads.add(messageThread);

        for (ProcessThread thread : threads) {
            thread.start();
        }

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (ProcessThread thread : threads) {
                thread.process(i);
            }

            while (true) {
                int countThreads = 0;
                for (ProcessThread thread : threads) {
                    if (thread.isProcessed()) {
                        countThreads++;

                    }
                }
                if (countThreads == threads.size()) {
                    break;
                }
            }
            for (ProcessThread thread : threads) {
                thread.interrupt();
            }

        }



    }
}
