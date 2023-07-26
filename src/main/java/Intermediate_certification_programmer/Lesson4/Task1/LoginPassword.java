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

public class LoginPassword {
    public static boolean checkLoginPass(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("20", login.length());
            }
            if (password.length() < 20 && password.equals(confirmPassword)) {
                throw new WrongPasswordException("20", password.length());
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
    }
}
