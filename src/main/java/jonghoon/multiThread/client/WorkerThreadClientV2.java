package jonghoon.multiThread.client;

import jonghoon.multiThread.workerthread.execute.WorkerThreadExecutorV2;

public class WorkerThreadClientV2 {
    public static void main(String[] args) {
        WorkerThreadExecutorV2 workerThreadExecutor = new WorkerThreadExecutorV2();
        workerThreadExecutor.execute();
    }
}
