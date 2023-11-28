package JDK.DZ5;

public class Main {
    public static void main(String[] args) {
        DiningPhilosophers table = new DiningPhilosophers();
        for (int i = 0; i < 5; i++) {
            final int philosopherNumber = i;
            new Thread(() -> table.lifecycle(philosopherNumber)).start();
        }
    }
}
