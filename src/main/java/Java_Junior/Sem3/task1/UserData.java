package Java_Junior.Sem3.task1;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class UserData implements Serializable {

    private final String name;
    private final int age;
    private final transient String password;

    public UserData(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

}
