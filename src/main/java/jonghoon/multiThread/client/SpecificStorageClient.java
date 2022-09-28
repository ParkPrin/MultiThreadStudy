package jonghoon.multiThread.client;

import jonghoon.multiThread.specificstorage.client.ClientThread;

public class SpecificStorageClient {
    public static void main(String[] args) {
        new ClientThread("Alice").start();
        new ClientThread("Bobby").start();
        new ClientThread("Chris").start();
    }
}
