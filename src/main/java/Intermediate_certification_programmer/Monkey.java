package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Monkey extends Pack_animals{

    public Monkey(PackAnimalsType.Type type) {
        super(type);
    }

    public Monkey(String nickname, LocalDate birthday, PackAnimalsType.Type type) {
        super(nickname, birthday, type);
    }

    public Monkey(String nickname, LocalDate birthday, ArrayList<String> commands, PackAnimalsType.Type type) {
        super(nickname, birthday, commands, type);
    }
}
