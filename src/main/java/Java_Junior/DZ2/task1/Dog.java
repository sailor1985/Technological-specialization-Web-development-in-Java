package Java_Junior.DZ2;

public class Dog extends Animal {

    String dog_breed;

    public Dog(String name, int age, String dog_breed) {
        super(name, age);
        this.dog_breed = dog_breed;
    }

    @Override
    public void voice() {
        System.out.println(super.getName() + " говорит: Гав");
    }
}
