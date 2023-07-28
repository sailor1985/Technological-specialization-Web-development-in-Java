package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ActionsOfMenu {
    public static Animals addNewAnimal (Scanner scanner) {
        String nickname = EnterInputData.animalNickname(scanner);
        LocalDate birthday = EnterInputData.animalBirthday(scanner);
        String type = EnterInputData.typeOfAnimal(scanner);
        String[] commandsArray = EnterInputData.commandsOfAnimal(scanner);
        ArrayList<String> commandsList = new ArrayList<>(Arrays.asList(commandsArray));

        Animals animal = null;
        switch (type.toLowerCase()) {
            case "cat" -> {
                animal = new Cat(nickname, birthday, commandsList, PetsType.Type.Cat);
            }
            case "dog" -> {
                animal = new Dog(nickname, birthday, commandsList, PetsType.Type.Dog);
            }
            case "parrot" -> {
                animal = new Parrot(nickname, birthday, commandsList, PetsType.Type.Parrot);
            }
            case "horse" -> {
                animal = new Horse(nickname, birthday, commandsList, PackAnimalsType.Type.Horse);
            }
            case "camel" -> {
                animal = new Camel(nickname, birthday, commandsList, PackAnimalsType.Type.Camel);
            }
            case "monkey" -> {
                animal = new Monkey(nickname, birthday, commandsList, PackAnimalsType.Type.Monkey);
            }
            default -> System.out.println("Ошибка: Недопустимый тип животного.");
        }
        return animal;
    }

    public static void searchByNameOfAnimalHisType (List<Animals> animalList, Scanner scanner) {
        String searchNickname = EnterInputData.animalNickname(scanner); // ввод имени животного для поиска
        boolean found = false;
        for (Animals currentAnimal : animalList) {
            if (currentAnimal.getNickname().equalsIgnoreCase(searchNickname)) {
                System.out.println("У найденного животного тип: " + currentAnimal.getClass().getSimpleName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Животное с таким именем не найдено.");
        }
    }
    public static void listOfCommands (List<Animals> animalList, Scanner scanner) {
        String searchNickname = EnterInputData.animalNickname(scanner); // ввод имени животного для поиска его команд
        boolean foundCommands = false;
        for (Animals currentAnimal : animalList) {
            if (currentAnimal.getNickname().equalsIgnoreCase(searchNickname)) {
                currentAnimal.showCommands();
                foundCommands = true;
                break;
            }
        }
        if (!foundCommands) {
            System.out.println("Животное с таким именем не найдено.");
        }
    }
    public static void newCommandsOfAnimal (List<Animals> animalList, Scanner scanner) {
        String searchNickname = EnterInputData.animalNickname(scanner); // ввод имени животного
        String newCommand = EnterInputData.newCommand(scanner); // ввод новой команды

        boolean foundCommands = false;
        for (Animals currentAnimal : animalList) {
            if (currentAnimal.getNickname().equalsIgnoreCase(searchNickname)) {
                currentAnimal.addCommand(newCommand);
                foundCommands = true;
                System.out.println(currentAnimal.getNickname() + " знает следующие команды: " + currentAnimal.getCommands());
                break;
            }
        }
        if (!foundCommands) {
            System.out.println("Животное с таким именем не найдено.");
        }
    }
}
