package Intermediate_certification_programmer;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
@NoArgsConstructor
public abstract class Animals {
    protected String nickname;
    protected LocalDate birthday;
    protected ArrayList<String> commands;

    public Animals(String nickname, LocalDate birthday) {
        this.nickname = nickname;
        this.birthday = birthday;
    }

    public Animals(String nickname, LocalDate birthday, ArrayList<String> commands) {
        this.nickname = nickname;
        this.birthday = birthday;
        this.commands = new ArrayList<>();
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void showCommands() {
        System.out.println("Список команд:");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

    @Override
    public String toString() {
        if (commands == null) {
            return "Animals{" +
                    "nickname='" + nickname + '\'' +
                    ", birthday=" + birthday +
                    '}';
        } else {
            return "Animals{" +
                    "nickname='" + nickname + '\'' +
                    ", birthday=" + birthday +
                    ", commands=" + commands +
                    '}';
        }

    }
}
