package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Pets{
    public Cat(String nickname, LocalDate birthday, PetsType.Type type) {
        super(nickname, birthday, type);
    }
    public Cat(String nickname, LocalDate birthday, List<String> commands, PetsType.Type type) {
        super(nickname, birthday, commands, type);
    }
}
