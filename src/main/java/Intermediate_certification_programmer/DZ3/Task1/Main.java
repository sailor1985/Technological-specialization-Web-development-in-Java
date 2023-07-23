package Intermediate_certification_programmer.DZ3.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //1. Создали класс ”Сотрудник” с полями: ФИО, должность, телефон, зарплата, возраст.
        //2. Написали метод getAllEmployeeFields(), выводящий всю доступную информацию об объекте с использованием форматирования строк.
        Employee employee1 = new Employee("Иван", "Java_разработчик", 123456789, 500, 25);
        Employee employee2 = new Employee("Ольга", "Python_разработчик", 23456789, 600, 46);
        Employee employee3 = new Employee("Евгений", "C#_разработчик", 3456789, 700, 27);
        Employee employee4 = new Employee("Александр", "Дизайнер", 456789, 800, 50);
        Employee employee5 = new Employee("Снежана", "Фронтэнд-разработчик", 123456789, 900, 30);

        // Применили метод getAllEmployeeFields()
        employee1.getAllEmployeeFields();
        System.out.println();

        //3. Создали массив из 5 сотрудников
        ArrayList <Employee> emps = new ArrayList<>();
        emps.add(employee1);
        emps.add(employee2);
        emps.add(employee3);
        emps.add(employee4);
        emps.add(employee5);
        System.out.println(emps);

        //4. Создали и применили метод raiseSalary(int age, int increaseSize), повышающий зарплату всем сотрудникам
        // старше 45 лет на 5000. Возраст и размер повышения должны быть параметрами метода.
        // А также вывели всех сотрудников, кому была повышена зарплата
        for (Employee e: emps) {
            e.raiseSalary(45, 5000);
        }

        //5. Написали и применили тот же метод повышения в качестве статического в классе сотрудника.
        //   Метод должен принимать в качестве параметра массив сотрудников.
        Employee.raiseSalaryEmployees(emps);

        //6. Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату
        // сотрудников, вывести результаты работы в консоль.

        //Средний возраст сотрудников
        double averageAge = 0;
        for (Employee e: emps) {
            averageAge = e.middleAge(emps);
        }
        System.out.printf("Средний возраст сотрудников %.1f %n", averageAge);

        //Средняя зарплата сотрудников
        int averageSalary = 0;
        for (Employee e: emps) {
            averageSalary = e.middleSalary(emps);
        }
        System.out.printf("Средняя зарплата сотрудников %d %n",averageSalary);
    }
}
