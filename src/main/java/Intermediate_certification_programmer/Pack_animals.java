package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pack_animals extends Animals {

    protected PackAnimalsType.Type type;

    public Pack_animals(PackAnimalsType.Type type) {
        this.type = type;
    }

    public Pack_animals(String nickname, LocalDate birthday, PackAnimalsType.Type type) {
        super(nickname, birthday);
        this.type = type;
    }

    public Pack_animals(String nickname, LocalDate birthday, ArrayList<String> commands, PackAnimalsType.Type type) {
        super(nickname, birthday, commands);
        this.type = type;
    }

    public Pack_animals() {

    }

    @Override
    public String toString() {
        return "Вьючные животные{" +
                "имя='" + nickname + '\'' +
                ", ДР=" + birthday +
                ", команды=" + commands +
                ", тип животного=" + type + "\n" +
                '}';
    }
}
