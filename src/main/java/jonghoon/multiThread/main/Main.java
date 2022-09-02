package jonghoon.multiThread.main;

import jonghoon.multiThread.workerthread.execute.WorkerThreadExecutor;

public class Main {
    public static void main(String[] args) {
        WorkerThreadExecutor workerThreadExecutor = new WorkerThreadExecutor();
        workerThreadExecutor.execute();
    }
}
