package Java_Junior.DZ3.task1;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Student implements Serializable {
    private final String name;
    private final int age;
    transient double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

}
