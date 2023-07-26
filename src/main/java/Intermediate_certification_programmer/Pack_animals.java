package Intermediate_certification_programmer;

import java.time.LocalDate;
import java.util.List;

public class Pack_animals extends Animals {

    protected PackAnimalsType.Type type;

    public Pack_animals(String nickname, LocalDate birthday, PackAnimalsType.Type type) {
        super(nickname, birthday);
        this.type = type;
    }

    public Pack_animals(String nickname, LocalDate birthday, List<String> commands, PackAnimalsType.Type type) {
        super(nickname, birthday, commands);
        this.type = type;
    }

    @Override
    public void whereLive() {
        System.out.println("Вьючные животные живут на природе или в зоопарке");
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
