package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.Scanner;

public class EnterInputData {
    public static String animalNickname(Scanner scanner) {
        System.out.print("Введите имя животного: ");
        return scanner.nextLine();
    }
    public static LocalDate animalBirthday(Scanner scanner) {
        System.out.println("Введите год, месяц и день рождения через пробел:");
        String[] input = scanner.nextLine().split(" ");

        int year = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int day = Integer.parseInt(input[2]);

        return LocalDate.of(year, month, day);
    }
    public static String typeOfAnimal(Scanner scanner) {
        System.out.print("Введите тип животного (Cat, Dog, Parrot, Horse, Camel, Monkey): ");
        return scanner.nextLine();
    }
    public static String newCommand(Scanner scanner) {
        System.out.print("Какую команду хотите добавить: ");
        return scanner.nextLine();
    }
    public static String[] commandsOfAnimal(Scanner scanner) {
        System.out.print("Какие команды знает животное? (перечисляйте через пробел): ");
        return scanner.nextLine().split(" ");
    }
}