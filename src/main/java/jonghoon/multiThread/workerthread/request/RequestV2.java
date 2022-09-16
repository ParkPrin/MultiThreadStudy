package jonghoon.multiThread.workerthread.request;

import java.util.Random;

public class RequestV2 implements Runnable{
    private final String name;
    private final int num;
    private static final Random random = new Random();
    public RequestV2(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String toString() {
        return "[ Request from " + name + " No." + num + " ]";
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "executes" + this);
        try{
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {

        }
    }
}
