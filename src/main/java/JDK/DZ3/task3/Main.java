package JDK.DZ3.task3;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Hello");
        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);

        System.out.println("pair1: " + pair1);
        System.out.println("pair2: " + pair2);

        Integer firstValue1 = pair1.getFirst();
        String secondValue1 = pair1.getSecond();
        System.out.println("First value of pair1: " + firstValue1);
        System.out.println("Second value of pair1: " + secondValue1);

        Double firstValue2 = pair2.getFirst();
        Boolean secondValue2 = pair2.getSecond();
        System.out.println("First value of pair2: " + firstValue2);
        System.out.println("Second value of pair2: " + secondValue2);
    }
}
