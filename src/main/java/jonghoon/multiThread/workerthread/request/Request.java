package jonghoon.multiThread.workerthread.request;

import java.util.Random;

public class Request {
    private final String name;
    private final int num;
    private static final Random random = new Random();
    public Request(String name, int num) {
        this.name = name;
        this.num = num;
    }
    public void execute() {
        System.out.println(Thread.currentThread().getName()+ " executes " + this);
        try {
          Thread.sleep(random.nextInt(1000));
        }  catch (InterruptedException e) {

        }
    }

    public String toString() {
        return "[ Request from " + name + " No." + num + " ]";
    }
}
