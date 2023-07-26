package Intermediate_certification_programmer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public abstract class Animals {
    protected String nickname;
    protected LocalDate birthday;
    protected List<String> commands =  new ArrayList<>();

    public Animals(String nickname, LocalDate birthday) {
        this.nickname = nickname;
        this.birthday = birthday;
    }

    public Animals(String nickname, LocalDate birthday, List<String> commands) {
        this.nickname = nickname;
        this.birthday = birthday;
        this.commands = commands;
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

    public abstract void whereLive();

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
