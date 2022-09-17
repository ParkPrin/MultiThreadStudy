package jonghoon.multiThread.future.data;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureDataV2 extends FutureTask<RealData> implements Data{

    public FutureDataV2(Callable<RealData> callable) {
        super(callable);
    }

    @Override
    public String getContent() {
        try {
            return get().getContent();
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
