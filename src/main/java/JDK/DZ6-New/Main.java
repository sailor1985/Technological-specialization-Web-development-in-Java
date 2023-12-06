import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MontyHallParadox game = new MontyHallParadox(1000);
        Map<Integer, String> results = game.runTests();
        game.printStatistics();

        // Вывод результатов
        for (Map.Entry<Integer, String> entry : results.entrySet()) {
            System.out.println("Step " + entry.getKey() + ": " + entry.getValue());
        }
    }
}


