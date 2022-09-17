package jonghoon.multiThread.future.host;

import jonghoon.multiThread.future.data.Data;
import jonghoon.multiThread.future.data.FutureData;
import jonghoon.multiThread.future.data.RealData;

public class Host {
    public Data request(final int count, final char c) {
        System.out.println(" request(" + count + ", " + c + ") BEGIN");

        final FutureData future = new FutureData();

        new Thread(() -> {
            RealData realData = new RealData(count, c);
            future.setRealData(realData);
        }).start();

        System.out.println(" request(" + count + ", " + c + ") END");
        return future;
    }
}
