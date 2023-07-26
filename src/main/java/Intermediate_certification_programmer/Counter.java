package Intermediate_certification_programmer;

public class Counter implements AutoCloseable {
    private int count = 0;
    private boolean isOpen = true;
    public Counter() {
        this.count = 0;
    }
    public void add() {
        if (!isOpen) {
            throw new IllegalStateException("Counter is closed and cannot be used");
        }
        count++;
    }
    public int getCount() {
        if (!isOpen) {
            throw new IllegalStateException("Counter is closed and cannot be used");
        }
        return count;
    }
    @Override
    public void close() {
        isOpen = false;
    }
    @Override
    public String toString() {
        return "Counter{" +
                "Счетчик равен=" + count +
                '}';
    }
}