package Intermediate_certification_programmer;

import java.util.Scanner;

public class ShowMenu {
    public static int showAppMenu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nМеню:");
        System.out.println("1. Завести новое животное в зоопарке");
        System.out.println("2. Определить правильный тип/класс по имени искомого животного");
        System.out.println("3. Увидеть список команд, которые выполняет животное");
        System.out.println("4. Обучить животное новым командам");
        System.out.println("5. Какие животные в зоопарке");
        System.out.println("6. Выход");

        System.out.print("Выберите пункт меню: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Чтение оставшегося символа новой строки

        return choice;
    }
}
