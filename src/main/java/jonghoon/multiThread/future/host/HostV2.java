package jonghoon.multiThread.future.host;

import java.util.concurrent.Callable;
import jonghoon.multiThread.future.data.Data;
import jonghoon.multiThread.future.data.FutureData;
import jonghoon.multiThread.future.data.FutureDataV2;
import jonghoon.multiThread.future.data.RealData;

public class HostV2 {
    public Data request(final int count, final char c) {
        System.out.println(" request(" + count + ", " + c + ") BEGIN");

        final FutureDataV2 future = new FutureDataV2(
                () -> new RealData(count, c)
        );

        new Thread(future).start();

        System.out.println(" request(" + count + ", " + c + ") END");
        return future;
    }
}
