package module12;

import java.util.concurrent.atomic.AtomicBoolean;

public class ProcessThread extends Thread{

    private int number;
    private final AtomicBoolean processed;
    private final NumberProcessor processor;

    public ProcessThread(NumberProcessor condition) {
        this.processor = condition;
        processed = new AtomicBoolean(true);
    }

    public  void process(int number) {
        this.number = number;
        processed.set(false);
    }

    public boolean isProcessed() {
        return processed.get();
    }
    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        while (true) {
    if (processed.get()) {
        continue;
    }
    processor.process(number);


    processed.set(true);
        }
    }
}
