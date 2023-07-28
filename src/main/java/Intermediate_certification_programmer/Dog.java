package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dog extends Pets {

    public Dog(PetsType.Type type) {
        super(type);
    }

    public Dog(String nickname, LocalDate birthday, PetsType.Type type) {
        super(nickname, birthday, type);
    }

    public Dog(String nickname, LocalDate birthday, ArrayList<String> commands, PetsType.Type type) {
        super(nickname, birthday, commands, type);
    }

    public Dog(String nickname, LocalDate birthday, String[] commandsList, PetsType.Type type) {
    }
}
