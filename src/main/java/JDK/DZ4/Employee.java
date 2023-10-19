package JDK.DZ4;

import lombok.Getter;

@Getter
public class Employee {
    private final int employeeId;
    private final String phoneNumber;
    private final String name;
    private final int experience;

    public Employee(int employeeId, String phoneNumber, String name, int experience) {
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }
}
