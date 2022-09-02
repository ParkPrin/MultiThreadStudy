package jonghoon.multiThread.workerthread.execute;

import jonghoon.multiThread.workerthread.channel.Channel;
import jonghoon.multiThread.workerthread.client.ClientThread;

public class WorkerThreadExecutor {
    public void execute() {
        Channel channel = new Channel(5);
        channel.startWorkers();
        new ClientThread("박종훈", channel).start();
        new ClientThread("이관영", channel).start();
        new ClientThread("전상혁", channel).start();
    }
}
