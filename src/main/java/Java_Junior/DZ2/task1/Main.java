package Java_Junior.DZ2.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Барсик", 5, "Сфинкс"));
        animals.add(new Dog("Барбос", 6, "Болонка"));
        animals.add(new Cat("Мурзик", 7, "Дворовый"));
        animals.add(new Dog("Мухтар", 8, "Овчарка"));

        //Разминочка))
        for (Animal animal : animals) {
            if (animal.getName().equals("Барсик") || animal.getName().equals("Мухтар")) {
                System.out.println("Класс: " + animal.getClass());
                animal.voice();
                System.out.println();
            }
        }

        for (Animal animal: animals) {
            Class<?> clazz = animal.getClass();
            Class<?> superClazz = clazz.getSuperclass();

            //Узнаем класс животного
            System.out.println("Животное " + clazz.getSimpleName() + ":");

            // Получаем все методы этого класса и выполняем конретный (makeSound) при его наличии
            Method[] methods = clazz.getMethods();
            boolean makeSoundFound = false;
            for (Method method : methods) {
                if (method.getName().equals("makeSound")) {
                    System.out.println(method.invoke(animal));
                    makeSoundFound = true;
                    break; // Выходим из цикла, так как метод найден
                }
            }
            if (!makeSoundFound) {
                System.out.println("Метод makeSound отсутствует");
            }
            // Получаем поля родительского класса Animal
            Field [] superFields = superClazz.getDeclaredFields();
            System.out.println("Поля родительского класса " + superClazz.getSimpleName() + ":");
            for (Field field: superFields) {
                System.out.println(field.getName() + "= " + field.get(animal));
            }
            // Получаем поля класса (Cat/Dog)
            Field [] fields = clazz.getDeclaredFields();
            System.out.println("Поля класса " + clazz.getSimpleName() + ": ");
            for (Field field: fields) {
                System.out.println(field.getName() + "= " + field.get(animal));
                System.out.println();
            }
        }
    }
}
