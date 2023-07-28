package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Parrot extends Pets{

    public Parrot(PetsType.Type type) {
        super(type);
    }

    public Parrot(String nickname, LocalDate birthday, PetsType.Type type) {
        super(nickname, birthday, type);
    }

    public Parrot(String nickname, LocalDate birthday, ArrayList<String> commands, PetsType.Type type) {
        super(nickname, birthday, commands, type);
    }

    public Parrot(String nickname, LocalDate birthday, String[] commandsList, PetsType.Type type) {
    }
}
