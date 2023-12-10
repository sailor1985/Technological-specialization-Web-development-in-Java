package Java_Junior.DZ3.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Java_Junior.DZ3.task2.StudentListApp.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Аркадий", 35, 3.5);
        Student student2= new Student("Арсений", 24, 4.5);
        Student student3 = new Student("Ангелина", 30, 3.9);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Сериализовать объект в форматы JSON, BIN, XML");
            System.out.println("2. Десериализовать объект из формата JSON");
            System.out.println("3. Десериализовать объект из форматов BIN");
            System.out.println("4. Десериализовать объект из форматов XML ");
            System.out.println("5. Выйти");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    StudentListApp.addNewStudent(student1, students);
                    StudentListApp.addNewStudent(student2, students);
                    StudentListApp.addNewStudent(student3, students);
                    break;
                case "2":
                    students = loadStudentsFromFile(FILE_JSON);
                    System.out.println("Объекты класса " + students.get(0).getClass().getSimpleName() + " десериализованы из файла " + FILE_JSON);
                    System.out.println(students);
                    break;
                case "3":
                    students = loadStudentsFromFile(FILE_BIN);
                    System.out.println("Объекты класса " + students.get(0).getClass().getSimpleName() + " десериализованы из файла " + FILE_BIN);
                    System.out.println(students);
                    break;
                case "4":
                    students = loadStudentsFromFile(FILE_XML);
                    System.out.println("Объекты класса " + students.get(0).getClass().getSimpleName() + " десериализованы из файла " + FILE_XML);
                    System.out.println(students);
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        }
    }
}