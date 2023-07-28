package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Horse extends Pack_animals{

    public Horse(PackAnimalsType.Type type) {
        super(type);
    }

    public Horse(String nickname, LocalDate birthday, PackAnimalsType.Type type) {
        super(nickname, birthday, type);
    }

    public Horse(String nickname, LocalDate birthday, ArrayList<String> commands, PackAnimalsType.Type type) {
        super(nickname, birthday, commands, type);
    }

    public Horse(String nickname, LocalDate birthday, String[] commandsList, PackAnimalsType.Type type) {
        super();
    }
}
