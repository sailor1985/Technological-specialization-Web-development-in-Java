package Java_Junior.Sem3.task2;

import lombok.Getter;

import java.io.*;

public class ToDo implements Externalizable {

    @Serial
    private static final long serialVersionUID = 1L;

    //region Поля

    /**
     * Наименование задачи
     * -- GETTER --
     *  Получить наименование задачи
     *
     * @return наименование задачи

     */
    @Getter
    private String title;

    /**
     * Статус задачи
     */
    private boolean isDone;

    //endregion

    public ToDo() {
    }

    public ToDo(String title) {
        this.title = title;
        isDone = false;
    }

    //region Externalizable implementation

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(title);
        out.writeBoolean(isDone);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        title = (String) in.readObject();
        isDone = in.readBoolean();
    }

    //endregion

    //region Методы

    /**
     * Получить статус выполнения задачи
     * @return статус выполнения задачи
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * Изменить статус выполнения задачи
     * @param done новый статус задачи
     */
    public void setDone(boolean done) {
        isDone = done;
    }
    //endregion
}
