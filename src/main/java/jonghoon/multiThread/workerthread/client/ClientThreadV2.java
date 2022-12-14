package jonghoon.multiThread.workerthread.client;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import jonghoon.multiThread.workerthread.channel.Channel;
import jonghoon.multiThread.workerthread.request.Request;
import jonghoon.multiThread.workerthread.request.RequestV2;

public class ClientThreadV2 extends Thread{
    private final ExecutorService executorService;
    private static final Random random = new Random();
    public ClientThreadV2(String name, ExecutorService executorService) {
        super(name);
        this.executorService = executorService;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; true; i++){

                RequestV2 request = new RequestV2(getName(), i);
                executorService.execute(request);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {

        } catch (RejectedExecutionException e){
            System.out.println(getName() + " : " + e);
        }
    }
}
