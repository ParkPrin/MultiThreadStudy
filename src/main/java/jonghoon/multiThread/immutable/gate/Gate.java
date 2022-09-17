package jonghoon.multiThread.immutable.gate;

import jonghoon.multiThread.immutable.person.Person;

public class Gate {
    private int counter = 0;
    public void pass(Person persson) {
        counter++;
        check(persson);
    }

    public String toString(Person person) {
        return "No." + counter + ": " + person.getName() + ", " +person.getAddress();
    }

    public void check(Person person) {
        if (person.getName().charAt(0) != person.getAddress().charAt(0)) {
            System.out.println("*****BROKEN*****" + toString(person));
        }
    }
}
