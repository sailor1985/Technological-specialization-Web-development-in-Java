package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Camel extends Pack_animals{

    public Camel(PackAnimalsType.Type type) {
        super(type);
    }

    public Camel(String nickname, LocalDate birthday, PackAnimalsType.Type type) {
        super(nickname, birthday, type);
    }

    public Camel(String nickname, LocalDate birthday, ArrayList<String> commands, PackAnimalsType.Type type) {
        super(nickname, birthday, commands, type);
    }

    public Camel(String nickname, LocalDate birthday, String[] commandsList, PackAnimalsType.Type type) {
        super();
    }
}
