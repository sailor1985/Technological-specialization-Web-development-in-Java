package Java_Junior.Sem3.task2;

import lombok.Getter;

import java.io.Serializable;

public class ToDoV1 implements Serializable {

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

    //region Конструкторы

    public ToDoV1() {
    }

    public ToDoV1(String title) {
        this.title = title;
        isDone = false;
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
