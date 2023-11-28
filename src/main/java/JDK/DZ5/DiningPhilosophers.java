package JDK.DZ5;

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    private final Semaphore[] forks;
    private final Semaphore maxDiners;

    public DiningPhilosophers() {
        forks = new Semaphore[] { new Semaphore(1), new Semaphore(1), new Semaphore(1), new Semaphore(1), new Semaphore(1) };
        maxDiners = new Semaphore(4);
    }

    private void eat(int philosopherNumber) throws InterruptedException {
        System.out.println("Philosopher " + philosopherNumber + " is eating");
        Thread.sleep(1000); // Simulate eating
    }

    public void lifecycle(int philosopherNumber) {
        try {
            while (true) {
                maxDiners.acquire(); // Позволяет одновременно принимать пищу максимум четырем философам
                forks[philosopherNumber].acquire();
                forks[(philosopherNumber + 1) % 5].acquire();
                eat(philosopherNumber);
                forks[philosopherNumber].release();
                forks[(philosopherNumber + 1) % 5].release();
                maxDiners.release();
                // Repeat eating three times
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
