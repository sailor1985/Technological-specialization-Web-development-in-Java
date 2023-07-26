package Intermediate_certification_programmer.Lesson4.Task1;

//Задание: Класс «Проверка логина и пароля».
//        1. Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//        2. Длина login должна быть меньше 20 символов. Если login не соответствует
//        этому требованию, необходимо выбросить WrongLoginException.
//        3. Длина password должна быть не меньше 20 символов. Также password и confirmPas должны быть равны.
//        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//        4. WrongPasswordException и WrongLoginException – пользовательские классы исключения с двумя конструкторами –-
//        один по умолчанию, второй принимает параметры исключения (неверные данные) и возвращает пользователю в
//        виде «ожидалось/фактически».
//        5. В основном классе программы необходимо по-разному обработать исключения.
//        6. Метод возвращает true, если значения верны или false в противном случае.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите login: ");
        String login = scanner.nextLine();
        System.out.println("Введите password: ");
        String pass = scanner.nextLine();
        System.out.println("Подтвердите password: ");
        String confirmPass = scanner.nextLine();

        Boolean flag = LoginPassword.checkLoginPass(login, pass, confirmPass);
        System.out.println(flag);
    }

}
