package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat extends Pets{

    public Cat(PetsType.Type type) {
        super(type);
    }

    public Cat(String nickname, LocalDate birthday, PetsType.Type type) {
        super(nickname, birthday, type);
    }

    public Cat(String nickname, LocalDate birthday, ArrayList<String> commands, PetsType.Type type) {
        super(nickname, birthday, commands, type);
    }

    public Cat(String nickname, LocalDate birthday, String[] commandsList, PetsType.Type type) {
        super();
    }
}
