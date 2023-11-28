package JDK.DZ4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр справочника
        EmployeeDirectory directory = new EmployeeDirectory();

        // Создаем сотрудников и добавляем их в справочник
        Employee employee1 = new Employee(1, "111-111-111", "Женя", 5);
        Employee employee2 = new Employee(2, "222-222-222", "Жанна", 3);
        Employee employee3 = new Employee(3, "333-333-333", "Борис", 7);
        Employee employee4 = new Employee(1, "111-111-111", "Долбоеб", 5);
        directory.addEmployee(employee1);
        directory.addEmployee(employee2);
        directory.addEmployee(employee3);
        directory.addEmployee(employee4);

        // Вызываем методы справочника
        List<Employee> employeesByExperience = directory.findEmployeesByExperience(5);
        System.out.println("Сотруднки со стажем 5 лет:");
        for (Employee employee : employeesByExperience) {
            System.out.println(employee.getName());
        }

        List<String> phoneNumbersByName = directory.findPhoneNumbersByName("Жанна");
        System.out.println("Номер телефона сотрудника с именем Жанна:");
        for (String phoneNumber : phoneNumbersByName) {
            System.out.println(phoneNumber);
        }

        Employee employeeById = directory.findEmployeeByEmployeeId(3);
        if (employeeById != null) {
            System.out.println("Сотрудник с табельным номером 3: " + employeeById.getName());
        } else {
            System.out.println("Сотрудник с табельным номером 3 не найден");
        }
    }
}