package Intermediate_certification_programmer;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> animalList = new ArrayList<>(); // Список животных нашего зоопарка
        Scanner scanner = new Scanner(System.in);
        try (Counter counter = new Counter()) {
            while (true) {
                int choice = ShowMenu.showAppMenu(); // выбор пункта меню
                switch (choice) {
                    //1. Завести новое животное в зоопарке
                    case 1 -> {
                        // определили имя, дату рождения и тип животного, которое будем добалять в зоопар
                        Animals animal = ActionsOfMenu.addNewAnimal(scanner);
                        animalList.add(animal);
                        counter.add();
                        System.out.println("Животное успешно добавлено.");
                    }
                    //2. Определить правильный тип/класс по имени искомого животного
                    case 2 -> ActionsOfMenu.searchByNameOfAnimalHisType(animalList, scanner); // определили тип животного по его имени
                    //3. Увидеть список команд, которые выполняет животное
                    case 3 -> ActionsOfMenu.listOfCommands(animalList, scanner); // вывели список команд по имени животного
                    // 4. Обучить животное новым командам
                    case 4 -> ActionsOfMenu.newCommandsOfAnimal(animalList, scanner); // добавили новую команду искомому животному
                    case 5 -> {
                        System.out.println("А тем временем у нас в зоопарке следующие животные: \n " + animalList);
                        System.out.println("Всего животных в зоопарке: " + counter.getCount());
                    }
                    case 6 -> {
                        System.out.println("Выход из программы...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Ошибка: Недопустимый пункт меню.");
                }
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}