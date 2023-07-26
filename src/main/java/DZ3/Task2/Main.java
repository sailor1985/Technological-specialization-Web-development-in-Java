package Intermediate_certification_programmer.DZ3.Task2;

import Intermediate_certification_programmer.DZ3.Task1.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Алексей", "Java_разработчик", 123456789, 500, 25);
        Employee employee2 =new Employee("Инга", "Python_разработчик", 23456789, 600, 46);
        Employee employee3 = new Employee("Евгений", "C#_разработчик", 3456789, 700, 27);
        Employee employee4 = new Employee("Александр", "Дизайнер", 456789, 800, 50);
        Employee employee5 = new Employee("Снежана", "Фронтэнд-разработчик", 123456789, 900, 30);
        Director director = new Director("Святогор", "Директор", 99999, 10000, 55);

        ArrayList <Employee> emps = new ArrayList<>();
        emps.add(employee1);
        emps.add(employee2);
        emps.add(employee3);
        emps.add(employee4);
        emps.add(employee5);
        emps.add(director);
        System.out.println(emps);

        Director.raiseSalaryOnlyEmployees(emps);
    }
}
