package jonghoon.multiThread.specificstorage.log;

public class Log {
    private static final ThreadLocal<TSLog> tsLogCollection = new ThreadLocal<TSLog>();

    public static void println(final String s) {
        System.out.println(s);
        getTSLog().println(s);
    }

    public static void close() {
        getTSLog().close();
    }

    private static TSLog getTSLog() {
        TSLog tsLog = tsLogCollection.get();

        if (tsLog == null) {
            System.out.println(Thread.currentThread().getName());
            tsLog = new TSLog(Thread.currentThread().getName() + "-log.txt");
            tsLogCollection.set(tsLog);
        }

        return tsLog;
    }
}
