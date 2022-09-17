package jonghoon.multiThread.client;

import jonghoon.multiThread.workerthread.execute.WorkerThreadExecutor;

public class WorkerThreadClient {
    public static void main(String[] args) {
        WorkerThreadExecutor workerThreadExecutor = new WorkerThreadExecutor();
        workerThreadExecutor.execute();
    }
}
