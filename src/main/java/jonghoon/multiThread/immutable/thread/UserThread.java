package jonghoon.multiThread.immutable.thread;

import jonghoon.multiThread.immutable.gate.Gate;
import jonghoon.multiThread.immutable.person.Person;

public class UserThread extends Thread {
    private final Gate gate;
    private final Person person;
    public UserThread(Gate gate, String name, String address){
        this.gate = gate;
        this.person = new Person(name, address);
    }
    public void run() {
        System.out.println(person.getName() + "BEGIN");
        while(true){
            gate.pass(person);
        }
    }
}
