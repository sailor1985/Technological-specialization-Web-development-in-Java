package Intermediate_certification_programmer.DZ3.Task1;

import com.google.common.math.Stats;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@Guava
public class Employee {
    private String name;
    private String post;
    private int telephone;
    private int salary;
    private int age;

    public void getAllEmployeeFields() {
        System.out.printf("Имя сотрудника: %s, должность: %s, телефон: %s, зарплата: %s, возраст: %d, %n", getName(), getPost(), getTelephone(), getSalary(), getAge());
    }
    public void raiseSalary(int age, int increaseSize) {
        if (this.age > age) {
            setSalary(getSalary()+increaseSize);
            getAllEmployeeFields();
        }
    }
    public static void raiseSalaryEmployees(ArrayList<Employee> employees) {
        for (Employee e: employees) {
            if (e.getAge() > 45) {
                e.setSalary(e.getSalary() + 5000);
                e.getAllEmployeeFields();
            }
        }
    }
    public double middleAge(ArrayList<Employee> employees) {
        ArrayList<Integer> middleAge = new ArrayList<>();
        for (Employee e: employees) {
            middleAge.add(e.getAge());
        }
        return Stats.meanOf(middleAge);
    }
    public int middleSalary(ArrayList<Employee> employees) {
        ArrayList<Integer> middleSalary = new ArrayList<>();
        for (Employee e: employees) {
            middleSalary.add(e.getSalary());
        }
        return (int) Stats.meanOf(middleSalary);
    }
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", telephone=" + telephone +
                ", salary=" + salary +
                ", age=" + age +'}' + "\n";
    }
}
