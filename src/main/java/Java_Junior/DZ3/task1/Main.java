package Java_Junior.DZ3.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Семен", 23, 4.5);

        try (FileOutputStream fileOutputStream = new FileOutputStream("student.bin")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("Объект Student сериализован.");
        }

        try (FileInputStream fileInputStream = new FileInputStream("student.bin")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student)objectInputStream.readObject();
            System.out.println("Объект Student десериализован.");
            System.out.println("Имя: " + student.getName());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Cредний балл (должен быть null, так как transient): " + student.getGPA());
        }
    }
}
