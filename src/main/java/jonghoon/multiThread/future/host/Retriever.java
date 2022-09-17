package jonghoon.multiThread.future.host;

import jonghoon.multiThread.future.content.Content;
import jonghoon.multiThread.future.content.SyncContentImpl;

public class Retriever {
    public static Content retrieve(String urlStr){
        final FutureContent future = new FutureContent(
                () -> new SyncContentImpl(urlStr)
        );

        new Thread(future).start();
        return future;
    }
}
