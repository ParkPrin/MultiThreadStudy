package jonghoon.multiThread.specificstorage.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TSLog {
    private PrintWriter writer;

    public TSLog(final String fileName){
        try {
            this.writer = new PrintWriter(new FileWriter(fileName));
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void println(final String s){
        writer.println(s);
    }

    public void close(){
        writer.println("=== End of log ====");
        writer.close();
    }
}
