package jonghoon.multiThread.future.host;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import jonghoon.multiThread.future.content.Content;
import jonghoon.multiThread.future.content.SyncContentImpl;

public class FutureContent extends FutureTask<SyncContentImpl> implements Content {

    public FutureContent(Callable<SyncContentImpl> callable) {
        super(callable);
    }

    @Override
    public byte[] getBytes() {
        try {
            return get().getBytes();
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
