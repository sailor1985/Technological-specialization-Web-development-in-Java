package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pets extends Animals {

    protected PetsType.Type type;

    public Pets(PetsType.Type type) {
        this.type = type;
    }

    public Pets(String nickname, LocalDate birthday, PetsType.Type type) {
        super(nickname, birthday);
        this.type = type;
    }

    public Pets(String nickname, LocalDate birthday, ArrayList<String> commands, PetsType.Type type) {
        super(nickname, birthday, commands);
        this.type = type;
    }

    public Pets() {

    }

    @Override
    public String toString() {
        return "Домашние животные{" +
                "имя='" + nickname + '\'' +
                ", ДР=" + birthday +
                ", команды=" + commands +
                ", тип животного=" + type +
                '}';
    }
}
