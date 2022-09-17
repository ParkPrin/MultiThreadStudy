package jonghoon.multiThread.client;

import jonghoon.multiThread.immutable.gate.Gate;
import jonghoon.multiThread.immutable.thread.UserThread;

public class ImmutableClient {
    public static void main(String[] args) {
        System.out.println("Testing Gate, hit CTRL+C to exit.");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}
