package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ActionsOfMenu {
    public static Animals addNewAnimal (Scanner scanner) {
        String nickname = EnterInputData.animalNickname(scanner); // ввод имени животного
        LocalDate birthday = EnterInputData.animalBirthday(scanner); // ввод даты рождения
        String type = EnterInputData.typeOfAnimal(scanner);// ввод типа животного
        List<String> commandsOfAnimal = EnterInputData.commandsOfAnimal(scanner); // ввод команд, которые знает животное
        Animals animal = null;
        switch (type.toLowerCase()) {
            case "cat" -> {
                if (commandsOfAnimal == null) {
                    animal = new Cat(nickname, birthday, PetsType.Type.Cat);
                } else {
                    animal = new Cat(nickname, birthday, commandsOfAnimal, PetsType.Type.Cat);
                }
            }
            case "dog" ->{
                if (commandsOfAnimal == null) {
                    animal = new Dog(nickname, birthday, PetsType.Type.Dog);
                } else {
                    animal = new Dog(nickname, birthday, commandsOfAnimal, PetsType.Type.Dog);
                }
            }
            case "parrot" -> {
                if (commandsOfAnimal == null) {
                    animal = new Parrot(nickname, birthday, PetsType.Type.Parrot);
                } else {
                    animal = new Parrot(nickname, birthday, commandsOfAnimal, PetsType.Type.Parrot);
                }
            }
            case "horse" -> {
                if (commandsOfAnimal == null) {
                    animal = new Horse(nickname, birthday, PackAnimalsType.Type.Horse);
                } else {
                    animal = new Horse(nickname, birthday, commandsOfAnimal, PackAnimalsType.Type.Horse);
                }
            }
            case "camel" -> {
                if (commandsOfAnimal == null) {
                    animal = new Camel(nickname, birthday, PackAnimalsType.Type.Camel);
                } else {
                    animal = new Camel(nickname, birthday, commandsOfAnimal, PackAnimalsType.Type.Camel);
                }
            }
            case "monkey" -> {
                if (commandsOfAnimal == null) {
                    animal = new Monkey(nickname, birthday, PackAnimalsType.Type.Monkey);
                } else {
                    animal = new Monkey(nickname, birthday, commandsOfAnimal, PackAnimalsType.Type.Monkey);
                }
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
                System.out.println("Теперь животное " + currentAnimal.getCommands() + "знает следующие команды: ");
                break;
            }
        }
        if (!foundCommands) {
            System.out.println("Животное с таким именем не найдено.");
        }
    }
}
