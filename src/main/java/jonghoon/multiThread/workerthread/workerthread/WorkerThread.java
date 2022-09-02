package jonghoon.multiThread.workerthread.workerthread;

import jonghoon.multiThread.workerthread.channel.Channel;
import jonghoon.multiThread.workerthread.request.Request;

public class WorkerThread extends Thread{
    private final Channel channel;
    public WorkerThread(String name, Channel channel){
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        while (true) {
            Request request = channel.takeRequest();
            request.execute();
        }
    }
}
