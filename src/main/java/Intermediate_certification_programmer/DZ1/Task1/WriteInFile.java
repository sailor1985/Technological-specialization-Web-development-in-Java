package Intermediate_certification_programmer.DZ1.Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteInFile {
    public void writeInFile(String filename, String noteToFile) {
        // Инициализировать объект файла
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(noteToFile);
            writer.newLine();
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
