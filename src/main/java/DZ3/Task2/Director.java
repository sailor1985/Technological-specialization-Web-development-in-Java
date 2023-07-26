package Intermediate_certification_programmer.DZ3.Task2;

import Intermediate_certification_programmer.DZ3.Task1.Employee;

import java.util.ArrayList;

public class Director extends Employee {
    public Director(String name, String post, int telephone, int salary, int age) {
        super(name, post, telephone, salary, age);
    }
    public static void raiseSalaryOnlyEmployees(ArrayList<Employee> employees) {
        for (Employee e: employees) {
            if (e.getAge() > 45 && e.getClass() != Director.class) {
                e.setSalary(e.getSalary() + 5000);
                e.getAllEmployeeFields();
            }
        }
    }
}