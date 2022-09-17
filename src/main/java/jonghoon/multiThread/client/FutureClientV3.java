package jonghoon.multiThread.client;

import java.io.FileOutputStream;
import java.io.IOException;
import jonghoon.multiThread.future.content.Content;
import jonghoon.multiThread.future.host.Retriever;

public class FutureClientV3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Content content1 = Retriever.retrieve("https://www.naver.com/");
        Content content2 = Retriever.retrieve("https://www.daum.net/");
        Content content3 = Retriever.retrieve("https://www.nate.com/");

        saveToFile("naver.html", content1);
        saveToFile("daum.html", content2);
        saveToFile("nate.html", content3);

        long end = System.currentTimeMillis();

        System.out.println("Elapesd time = " + (end - start) + "msec.");
    }

    private static void saveToFile(String fileName, Content content) {
        byte[] bytes = content.getBytes();
        try {
            System.out.println(Thread.currentThread().getName() + ": Saving to " + fileName);
            FileOutputStream out = new FileOutputStream(fileName);
            for (int i = 0; i < bytes.length; i++){
                out.write(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
