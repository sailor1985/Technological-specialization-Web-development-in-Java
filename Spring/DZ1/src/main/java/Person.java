import com.google.gson.Gson;
import lombok.Getter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


@Getter
public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;
    public static final String FILE_JSON = "person.json";


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return new EqualsBuilder()
                .append(firstName, person.firstName)
                .append(lastName, person.lastName)
                .append(age, person.age)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("age", age)
                .toString();
    }

    public void saveToFileJson(Person person, Gson gson) {
        try (FileWriter writer = new FileWriter(FILE_JSON)) {
            // Сериализация объекта Person в файл
            gson.toJson(person, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Person loadFromFileJson(Gson gson) {
        try (FileReader reader = new FileReader(FILE_JSON)) {
            // Десериализация объекта Person из файла
            return gson.fromJson(reader, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}