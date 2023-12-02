package Java_Junior.Sem2.task3.models;

import Java_Junior.Sem2.task3.Column;

import java.util.UUID;

public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;

}
