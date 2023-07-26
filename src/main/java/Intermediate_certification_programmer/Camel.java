package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.List;

public class Camel extends Pack_animals{
    public Camel(String nickname, LocalDate birthday, PackAnimalsType.Type type) {
        super(nickname, birthday, type);
    }
    public Camel(String nickname, LocalDate birthday, List<String> commands, PackAnimalsType.Type type) {
        super(nickname, birthday, commands, type);
    }
}
