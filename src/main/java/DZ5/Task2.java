package DZ5;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        int[][] gameField = {{1, 0, 2}, {3, 1, 0}, {2, 3, 1}};
        printGameField(gameField); // Посмотрели, как должно быть

        String fileName = "src/main/resources/gamefield.txt";
        writeGameFieldToFile(gameField, fileName);

        int[][] importedGameField = readGameFieldFromFile(fileName);
        printGameField(importedGameField); // Посмотрели, что считалось с файла и убедились, что соответствует начальному массиву
    }
    public static void writeGameFieldToFile(int[][] gameField, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int[] ints : gameField) {
                for (int anInt : ints) writer.print(anInt + " ");
            }
            writer.println();
        } catch (IOException e) {
            System.out.println("Error writing game field to file: " + e.getMessage());
        }
    }
    public static int[][] readGameFieldFromFile(String fileName) {
        int[][] importedGameField = new int[3][3];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int rowIndex = 0;
            int colIndex = 0;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    importedGameField[rowIndex][colIndex] = Integer.parseInt(number);
                    colIndex++;

                    if (colIndex == importedGameField[rowIndex].length) {
                        colIndex = 0;
                        rowIndex++;
                    }

                    if (rowIndex == importedGameField.length) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading game field from file: " + e.getMessage());
        }

        return importedGameField;
    }
    public static void printGameField(int[][] gameField) {
        for (int[] row : gameField) {
            for (int cell : row) {
                String symbol = switch (cell) {
                    case 0 -> "•";
                    case 1 -> "X";
                    case 2 -> "O";
                    default -> "";
                };
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}

