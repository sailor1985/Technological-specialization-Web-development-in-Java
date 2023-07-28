package DZ5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Task1 {

    public static void main(String[] args) throws IOException {
        createBackup("src/main/java/Lesson5");
    }
    public static void createBackup(String directoryPath) {
        File dir = new File(directoryPath);
        File[] fileList = dir.listFiles();
        File backupDir = new File("src/main/resources/backup");

        if (fileList != null) {
            for (File file : fileList) {
                if (file.isFile()) {
                    File backupFile = new File(backupDir, file.getName());
                    try {
                        Files.copy(file.toPath(), backupFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        System.out.println("There was a problem creating a backup: " + e.getMessage());
                    }
                }
            }
        }
    }
}
