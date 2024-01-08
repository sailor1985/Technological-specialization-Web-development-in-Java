import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Johnson", 30);
        Gson gson = new Gson();

        // Сериализация объекта класса Person в JSON
        person.saveToFileJson(person,gson); //записали в файл формата json
        System.out.println("The object of the " + person.getClass() + " is serialized to file " + Person.FILE_JSON);
        System.out.println(person);

        // Десериализация объекта класса Person из JSON
        Person deserializedPerson = person.loadFromFileJson(gson);
        System.out.println("The object of the " + person.getClass() + " is deserialized from file " + Person.FILE_JSON);
        System.out.println(deserializedPerson);

    }
}
