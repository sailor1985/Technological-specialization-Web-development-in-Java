import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontyHallParadox {
    private final int totalTests;
    private int wins;
    private int losses;

    public MontyHallParadox(int totalTests) {
        this.totalTests = totalTests;
        this.wins = 0;
        this.losses = 0;
    }

    public Map<Integer, String> runTests() {
        Map<Integer, String> results = new HashMap<>();
        Random random = new Random();

        for (int i = 1; i <= totalTests; i++) {
            int carPosition = random.nextInt(3) + 1; // Позиция автомобиля
            int initialChoice = random.nextInt(3) + 1; // Исходный выбор участника

            // Монтаж демонстрирует одну из дверей с козой
            int montyShow;
            do {
                montyShow = random.nextInt(3) + 1;
            } while (montyShow == carPosition || montyShow == initialChoice);

            // Участник меняет свой выбор
            int finalChoice = (1 + 2 + 3) - initialChoice - montyShow;

            // Подсчет побед и поражений
            if (finalChoice == carPosition) {
                wins++;
                results.put(i, "Win");
            } else {
                losses++;
                results.put(i, "Loss");
            }
        }
        return results;
    }
    


    

    public void printStatistics() {
        System.out.println("Total tests: " + totalTests);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}