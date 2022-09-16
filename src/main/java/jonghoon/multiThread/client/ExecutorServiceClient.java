package jonghoon.multiThread.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jonghoon.multiThread.workerthread.client.ClientThreadV2;

public class ExecutorServiceClient {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try {
            new ClientThreadV2("박종훈", executorService).start();
            new ClientThreadV2("이관영", executorService).start();
            new ClientThreadV2("전상혁", executorService).start();

            Thread.sleep(5000);
        } catch (InterruptedException e) {

        } finally {
            executorService.shutdown();
        }
    }
}
